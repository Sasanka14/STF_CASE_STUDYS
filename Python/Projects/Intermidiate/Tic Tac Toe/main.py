# main.py

from board import Board
from ai import get_ai_move, HUMAN, AI
from utils import get_player_move, choose_difficulty, play_again


def print_scoreboard(score):
    print("\n===== SCOREBOARD =====")
    print(f"You (X): {score['human']}")
    print(f"AI (O):  {score['ai']}")
    print(f"Draws:   {score['draws']}")
    print("======================\n")


def play_single_game(difficulty: str, score: dict):
    board = Board()
    current_player = HUMAN  # human always starts

    print(f"\n=== New Game – Difficulty: {difficulty.capitalize()} ===")

    while True:
        board.display()

        if current_player == HUMAN:
            # Human move
            row, col = get_player_move()

            if not board.place_mark(row, col, HUMAN):
                print("That cell is already taken. Try again.")
                continue

            if board.check_winner(HUMAN):
                board.display()
                print("\n🎉 You win! Excellent move.")
                score["human"] += 1
                break

            current_player = AI

        else:
            # AI move
            print("\nAI is thinking...")
            row, col = get_ai_move(board, difficulty)
            board.place_mark(row, col, AI)

            if board.check_winner(AI):
                board.display()
                print("\n🤖 AI wins! Tough opponent.")
                score["ai"] += 1
                break

            current_player = HUMAN

        if board.is_full():
            board.display()
            print("\nIt's a draw. Balanced game.")
            score["draws"] += 1
            break


def main():
    print("=== Tic Tac Toe (You = X, AI = O) ===")
    print("Row and column numbers are 0, 1, 2.")

    # Global scoreboard
    score = {"human": 0, "ai": 0, "draws": 0}

    # Choose difficulty once; keep it for the whole session
    difficulty = choose_difficulty()

    while True:
        play_single_game(difficulty, score)
        print_scoreboard(score)

        if not play_again():
            print("\nThanks for playing. See you next time.")
            break


if __name__ == "__main__":
    main()
