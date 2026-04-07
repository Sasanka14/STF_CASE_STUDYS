# board.py

class Board:
    def __init__(self):
        # 3x3 grid filled with spaces
        self.cells = [[" " for _ in range(3)] for _ in range(3)]

    def display(self):
        """Print the current board in a user-friendly way."""
        print("\n   0   1   2")
        for i, row in enumerate(self.cells):
            print(f"{i}  " + " | ".join(row))
            if i < 2:
                print("  " + "-" * 9)

    def place_mark(self, row, col, mark):
        """Place mark at (row, col) if empty. Return True if success."""
        if self.cells[row][col] == " ":
            self.cells[row][col] = mark
            return True
        return False

    def is_full(self):
        """Check if the board is completely filled."""
        return all(cell != " " for row in self.cells for cell in row)

    def check_winner(self, mark):
        """Return True if given mark (X/O) has a winning line."""
        c = self.cells

        # Rows and columns
        for i in range(3):
            if all(c[i][j] == mark for j in range(3)):
                return True
            if all(c[j][i] == mark for j in range(3)):
                return True

        # Diagonals
        if all(c[i][i] == mark for i in range(3)):
            return True
        if all(c[i][2 - i] == mark for i in range(3)):
            return True

        return False

    def available_moves(self):
        """Return list of (row, col) for all empty cells."""
        moves = []
        for i in range(3):
            for j in range(3):
                if self.cells[i][j] == " ":
                    moves.append((i, j))
        return moves

    def clone(self):
        """Create a deep copy of the board (for AI simulation)."""
        new_board = Board()
        new_board.cells = [row[:] for row in self.cells]
        return new_board
