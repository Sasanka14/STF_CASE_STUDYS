"""Write a program to find a secret number between 1 to 100. The user has to guess the number in minimum attempts. 
After each attempt, the program should provide feedback indicating whether the guessed number is too high, too low, or correct. 
Use loops and conditional statements to implement this functionality."""

import random
# Generate a secret number between 1 and 100
secret_number = random.randint(1, 100)
attempts = 0
max_attempts = 10
print("Welcome to the Secret Number Guessing Game!")
print("I have selected a secret number between 1 and 100.")
print(f"You have {max_attempts} attempts to guess the number.")

while attempts < max_attempts:
    try:
        guess = int(input("Enter your guess: "))
        attempts += 1
        
        if guess < 1 or guess > 100:
            print("Please guess a number within the range of 1 to 100.")
            continue
        
        if guess < secret_number:
            print("Too low! Try again.")
        elif guess > secret_number:
            print("Too high! Try again.")
        else:
            print(f"Congratulations! You've guessed the secret number {secret_number} in {attempts} attempts.")
            break
    except ValueError:
        print("Invalid input! Please enter a valid integer.")
else:
    print(f"Sorry, you've used all your attempts. The secret number was {secret_number}. Better luck next time!")