# Q$. A simple number guessing game.
secret = 7
guess = int(input("Guess my lucky number (1–10): "))
if guess == secret:
    print("🎉 Correct! You’re lucky!")
else:
    print("❌ Nope, try again!")
