# snake_game.py
"""
Intermediate Snake Game using Pygame

Concepts:
- Pygame window, event loop, surfaces
- Classes & composition (Snake, Food, Game)
- Grid-based movement
- Collision detection (wall, self, food)
- Score, difficulty scaling, restart logic
"""

import pygame
import random
from dataclasses import dataclass

# CONSTANTS

CELL_SIZE = 20
GRID_WIDTH = 30   # 30 * 20 = 600 px
GRID_HEIGHT = 30  # 30 * 20 = 600 px
SCREEN_WIDTH = CELL_SIZE * GRID_WIDTH
SCREEN_HEIGHT = CELL_SIZE * GRID_HEIGHT

FPS_BASE = 9
FPS_MAX = 25

COLOR_BG = (15, 23, 42)      # dark slate
COLOR_GRID = (30, 41, 59)
COLOR_SNAKE = (56, 189, 248) # cyan
COLOR_SNAKE_HEAD = (34, 211, 238)
COLOR_FOOD = (248, 113, 113) # salmon
COLOR_TEXT = (248, 250, 252)
COLOR_TEXT_MUTED = (148, 163, 184)


# HELPER DATACLASS

@dataclass
class Point:
    x: int
    y: int

    def __iter__(self):
        yield self.x
        yield self.y


# SNAKE CLASS

class Snake:
    def __init__(self):
        # Start in the center with length 3
        start_x = GRID_WIDTH // 2
        start_y = GRID_HEIGHT // 2
        self.body = [
            Point(start_x, start_y),
            Point(start_x - 1, start_y),
            Point(start_x - 2, start_y),
        ]
        self.direction = Point(1, 0)  # moving right
        self.grow_pending = 0

    @property
    def head(self) -> Point:
        return self.body[0]

    def change_direction(self, dx: int, dy: int):
        # Prevent reversing directly into itself
        new_dir = Point(dx, dy)
        if len(self.body) > 1:
            second = self.body[1]
            if second.x == self.head.x + new_dir.x and second.y == self.head.y + new_dir.y:
                return
        self.direction = new_dir

    def move(self):
        new_head = Point(
            self.head.x + self.direction.x,
            self.head.y + self.direction.y,
        )
        self.body.insert(0, new_head)

        if self.grow_pending > 0:
            self.grow_pending -= 1
        else:
            self.body.pop()

    def grow(self, amount: int = 1):
        self.grow_pending += amount

    def collide_with_self(self) -> bool:
        return any(
            segment.x == self.head.x and segment.y == self.head.y
            for segment in self.body[1:]
        )

    def occupy(self, x: int, y: int) -> bool:
        return any(seg.x == x and seg.y == y for seg in self.body)


# FOOD CLASS

class Food:
    def __init__(self, snake: Snake):
        self.position = self._random_position(snake)

    def _random_position(self, snake: Snake) -> Point:
        while True:
            x = random.randint(0, GRID_WIDTH - 1)
            y = random.randint(0, GRID_HEIGHT - 1)
            if not snake.occupy(x, y):
                return Point(x, y)

    def respawn(self, snake: Snake):
        self.position = self._random_position(snake)


# GAME CLASS

class Game:
    def __init__(self):
        pygame.init()
        pygame.display.set_caption("Snake Game – Intermediate")

        self.screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
        self.clock = pygame.time.Clock()
        self.font_main = pygame.font.SysFont("Segoe UI", 24)
        self.font_big = pygame.font.SysFont("Segoe UI", 40, bold=True)

        self.reset()

    def reset(self):
        self.snake = Snake()
        self.food = Food(self.snake)
        self.score = 0
        self.game_over = False
        self.paused = False

    # GAME LOOP

    def run(self):
        running = True
        while running:
            self.clock.tick(self._current_fps())
            running = self._handle_events()

            if not self.game_over and not self.paused:
                self._update()

            self._draw()

        pygame.quit()

    # INTERNAL METHODS

    def _handle_events(self) -> bool:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                return False

            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:
                    return False

                # Restart after game over
                if self.game_over and event.key == pygame.K_r:
                    self.reset()
                    return True

                # Pause toggle
                if event.key == pygame.K_SPACE and not self.game_over:
                    self.paused = not self.paused
                    return True

                # Controls (WASD + arrows)
                if event.key in (pygame.K_w, pygame.K_UP):
                    self.snake.change_direction(0, -1)
                elif event.key in (pygame.K_s, pygame.K_DOWN):
                    self.snake.change_direction(0, 1)
                elif event.key in (pygame.K_a, pygame.K_LEFT):
                    self.snake.change_direction(-1, 0)
                elif event.key in (pygame.K_d, pygame.K_RIGHT):
                    self.snake.change_direction(1, 0)

        return True

    def _update(self):
        self.snake.move()

        # Wall collision
        if (
            self.snake.head.x < 0
            or self.snake.head.x >= GRID_WIDTH
            or self.snake.head.y < 0
            or self.snake.head.y >= GRID_HEIGHT
        ):
            self.game_over = True
            return

        # Self collision
        if self.snake.collide_with_self():
            self.game_over = True
            return

        # Food collision
        if self.snake.head.x == self.food.position.x and self.snake.head.y == self.food.position.y:
            self.score += 1
            self.snake.grow()
            self.food.respawn(self.snake)

    def _draw_grid(self):
        for x in range(0, SCREEN_WIDTH, CELL_SIZE):
            pygame.draw.line(self.screen, COLOR_GRID, (x, 0), (x, SCREEN_HEIGHT))
        for y in range(0, SCREEN_HEIGHT, CELL_SIZE):
            pygame.draw.line(self.screen, COLOR_GRID, (0, y), (SCREEN_WIDTH, y))

    def _draw_snake(self):
        # Draw body
        for segment in self.snake.body[1:]:
            rect = pygame.Rect(segment.x * CELL_SIZE, segment.y * CELL_SIZE, CELL_SIZE, CELL_SIZE)
            pygame.draw.rect(self.screen, COLOR_SNAKE, rect, border_radius=4)

        # Draw head
        head = self.snake.head
        head_rect = pygame.Rect(head.x * CELL_SIZE, head.y * CELL_SIZE, CELL_SIZE, CELL_SIZE)
        pygame.draw.rect(self.screen, COLOR_SNAKE_HEAD, head_rect, border_radius=6)

    def _draw_food(self):
        rect = pygame.Rect(
            self.food.position.x * CELL_SIZE,
            self.food.position.y * CELL_SIZE,
            CELL_SIZE,
            CELL_SIZE,
        )
        pygame.draw.rect(self.screen, COLOR_FOOD, rect, border_radius=6)

    def _draw_hud(self):
        score_surf = self.font_main.render(f"Score: {self.score}", True, COLOR_TEXT)
        self.screen.blit(score_surf, (10, 8))

        speed_surf = self.font_main.render(f"Speed: {self._current_fps()} FPS", True, COLOR_TEXT_MUTED)
        self.screen.blit(speed_surf, (SCREEN_WIDTH - speed_surf.get_width() - 10, 8))

        if self.paused and not self.game_over:
            text = self.font_main.render("Paused – press SPACE to resume", True, COLOR_TEXT)
            self.screen.blit(
                text,
                ((SCREEN_WIDTH - text.get_width()) // 2, SCREEN_HEIGHT - 40),
            )

    def _draw_game_over(self):
        overlay = pygame.Surface((SCREEN_WIDTH, SCREEN_HEIGHT), pygame.SRCALPHA)
        overlay.fill((15, 23, 42, 200))
        self.screen.blit(overlay, (0, 0))

        title = self.font_big.render("Game Over", True, COLOR_TEXT)
        score_text = self.font_main.render(f"Final Score: {self.score}", True, COLOR_TEXT)
        restart_text = self.font_main.render("Press R to restart, ESC to quit", True, COLOR_TEXT_MUTED)

        self.screen.blit(title, ((SCREEN_WIDTH - title.get_width()) // 2, SCREEN_HEIGHT // 2 - 60))
        self.screen.blit(score_text, ((SCREEN_WIDTH - score_text.get_width()) // 2, SCREEN_HEIGHT // 2 - 20))
        self.screen.blit(restart_text, ((SCREEN_WIDTH - restart_text.get_width()) // 2, SCREEN_HEIGHT // 2 + 20))

    def _draw(self):
        self.screen.fill(COLOR_BG)
        self._draw_grid()
        self._draw_snake()
        self._draw_food()
        self._draw_hud()

        if self.game_over:
            self._draw_game_over()

        pygame.display.flip()

    def _current_fps(self) -> int:
        # Increase speed with score, but cap it
        return min(FPS_BASE + self.score // 2, FPS_MAX)


def main():
    game = Game()
    game.run()


if __name__ == "__main__":
    main()
