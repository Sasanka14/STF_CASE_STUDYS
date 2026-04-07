# utils.py

def get_player_move():
    """
    Ask user to enter row and column.
    Keeps asking until a valid pair is entered.
    """
    while True:
        try:
            print("\nYour move (X).")
            row = int(input("Enter row (0, 1, 2): "))
            col = int(input("Enter column (0, 1, 2): "))

            if row in (0, 1, 2) and col in (0, 1, 2):
                return row, col
            else:
                print("Please enter values between 0–2 only.")
        except ValueError:
            print("Invalid input. Please enter numbers only.")


def choose_difficulty():
    """
    Let user select difficulty: Easy / Medium / Hard.
    Returns 'easy', 'medium' or 'hard'.
    """
    print("\nSelect Difficulty:")
    print("1. Easy   (Random moves)")
    print("2. Medium (Basic strategy)")
    print("3. Hard   (Minimax – very strong)")

    while True:
        choice = input("Enter 1, 2, or 3: ").strip()
        if choice == "1":
            return "easy"
        elif choice == "2":
            return "medium"
        elif choice == "3":
            return "hard"
        else:
            print("Invalid choice. Please enter 1, 2, or 3.")


def play_again():
    """
    Ask if the user wants to play another round.
    Returns True or False.
    """
    while True:
        ans = input("\nDo you want to play again? (y/n): ").strip().lower()
        if ans in ("y", "yes"):
            return True
        elif ans in ("n", "no"):
            return False
        else:
            print("Please enter 'y' or 'n'.")
