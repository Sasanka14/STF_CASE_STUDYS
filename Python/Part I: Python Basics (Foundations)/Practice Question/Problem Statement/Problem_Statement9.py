"""Write a Python program to simulate a lucky draw among 10 participants. The program should:
1. Take the names of 10 participants as input.
2. Randomly select a winner from the list of participants and two backup winners.
3. Announce the winner's name.
4. Ensure that the same participant cannot win more than once if the program is run multiple times.
5. Store the names of previous winners in a file named 'winners.txt' to keep track of past winners.
6. Before selecting a winner, check the 'winners.txt' file to avoid selecting a previous winner.
"""

import random
import os
def load_previous_winners(filename):
    # Load previous winners from the specified file.
    if os.path.exists(filename):
        with open(filename, 'r') as file:
            winners = {line.strip() for line in file}
        return winners
    return set()

def save_winners(filename, winners):
    # Save the current winners to the specified file.
    with open(filename, 'a') as file:
        for winner in winners:
            file.write(f"{winner}\n")
def main(): 
    FILENAME = 'winners.txt'
    previous_winners = load_previous_winners(FILENAME)

    participants = []
    print("Enter the names of 10 participants:")
    while len(participants) < 10:
        name = input(f"Participant {len(participants) + 1}: ").strip()
        if name and name not in participants:
            participants.append(name)
        else:
            print("Invalid or duplicate name. Please try again.")

    eligible_participants = [p for p in participants if p not in previous_winners]

    if len(eligible_participants) < 3:
        print("Not enough eligible participants to select a winner and backups.")
        return

    winner = random.choice(eligible_participants)
    eligible_participants.remove(winner)
    backup_winners = random.sample(eligible_participants, 2)

    print(f"Congratulations to the Winner: {winner} 🎉")
    print(f"Backup Winners: {', '.join(backup_winners)}")

    save_winners(FILENAME, [winner] + backup_winners)
if __name__ == "__main__":
    main()