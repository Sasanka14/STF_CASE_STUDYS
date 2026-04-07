# number_guessing_game.py

"""
Concepts:
- random numbers
- while loop
- comparison operators
- counters
"""

import random


def main():
    print("=== Number Guessing Game ===")
    secret = random.randint(1, 100)
    attempts = 0

    while True:
        guess_str = input("Guess a number between 1 and 100 (or 'q' to quit): ").strip()
        if guess_str.lower() == "q":
            print(f"You quit. The number was {secret}.")
            break

        try:
            guess = int(guess_str)
        except ValueError:
            print("Please enter a valid integer.")
            continue

        attempts += 1

        if guess < secret:
            print("Too low!")
        elif guess > secret:
            print("Too high!")
        else:
            print(f"Correct! You guessed it in {attempts} attempts.")
            break


if __name__ == "__main__":
    main()
