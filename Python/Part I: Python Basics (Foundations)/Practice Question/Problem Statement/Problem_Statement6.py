"""Write a Python program to simulate an ATM machine with the following features:
1. Welcome Message 
2. Select Language (English, Hindi)
3. Enter your card details (Card Number and PIN).
4. Type of Account (Savings, Current)
5. Main Menu with options:
   a. Check Balance
   b. Withdraw Cash
   c. Deposit Cash
   d. Exit
6. For Withdraw and Deposit, ask for the amount.
7. Display appropriate messages for each action.
8. Use loops and control flow statements to manage the flow of the program.
9. Ensure that the user can perform multiple transactions until they choose to exit.
"""
import json
import os

DATABASE_FILE = "bank_data.json"


# -------------------- Utility Functions --------------------

def load_data():
    """Load bank data from JSON file or create new one."""
    if os.path.exists(DATABASE_FILE):
        with open(DATABASE_FILE, "r") as file:
            try:
                return json.load(file)
            except json.JSONDecodeError:
                return {}
    else:
        return {}


def save_data(data):
    """Save bank data to JSON file."""
    with open(DATABASE_FILE, "w") as file:
        json.dump(data, file, indent=4)


# -------------------- Account Creation --------------------

def create_account():
    print("===========================================")
    print("       🏦 WELCOME TO PYTHON BANK 🏦         ")
    print("===========================================\n")

    data = load_data()

    print("Let's create your bank account first.\n")
    name = input("Enter your Full Name: ")

    while True:
        card_number = input("Set your 6-digit Card Number: ")
        if card_number.isdigit() and len(card_number) == 6:
            if card_number in data:
                print("⚠️ This card number already exists. Try a different one.")
            else:
                break
        else:
            print("❌ Invalid! Enter a valid 6-digit card number.")

    pin = input("Set a 4-digit PIN: ")
    while not (pin.isdigit() and len(pin) == 4):
        pin = input("❌ Invalid! Enter a valid 4-digit PIN: ")

    data[card_number] = {
        "name": name,
        "pin": pin,
        "balance": 0.0
    }

    save_data(data)
    print("\n✅ Account created successfully!")
    print(f"Welcome, {name}! Your current balance is ₹0.00\n")


# -------------------- ATM Session --------------------

def atm_session():
    data = load_data()

    print("===========================================")
    print("         🏧 PYTHON BANK ATM SYSTEM          ")
    print("===========================================\n")

    entered_card = input("Please insert your card (Enter your 6-digit Card Number): ")

    if entered_card not in data:
        print("❌ Card not found. Please create an account first.\n")
        return

    entered_pin = input("Enter your 4-digit PIN: ")

    if entered_pin != data[entered_card]["pin"]:
        print("❌ Incorrect PIN. Transaction terminated.\n")
        return

    account = data[entered_card]
    print(f"\n✅ Welcome, {account['name']}! Access Granted.\n")

    while True:
        print("-------------------------------------------")
        print("                 MAIN MENU")
        print("-------------------------------------------")
        print("1. Check Balance")
        print("2. Deposit Cash")
        print("3. Withdraw Cash")
        print("4. Exit")
        choice = input("Enter your choice (1-4): ")

        if choice == "1":
            print(f"\n💰 Current Balance: ₹{account['balance']:.2f}\n")

        elif choice == "2":
            try:
                amount = float(input("Enter amount to deposit: ₹"))
                if amount <= 0:
                    print("⚠️ Invalid amount. Try again.\n")
                else:
                    account["balance"] += amount
                    data[entered_card] = account
                    save_data(data)
                    print(f"✅ ₹{amount:.2f} deposited successfully.")
                    print(f"💼 Updated Balance: ₹{account['balance']:.2f}\n")
            except ValueError:
                print("⚠️ Please enter a valid numeric amount.\n")

        elif choice == "3":
            try:
                amount = float(input("Enter amount to withdraw: ₹"))
                if amount <= 0:
                    print("⚠️ Invalid amount. Try again.\n")
                elif amount > account["balance"]:
                    print("❌ Insufficient balance.\n")
                else:
                    account["balance"] -= amount
                    data[entered_card] = account
                    save_data(data)
                    print(f"✅ Please collect ₹{amount:.2f} cash.")
                    print(f"💼 Remaining Balance: ₹{account['balance']:.2f}\n")
            except ValueError:
                print("⚠️ Please enter a valid numeric amount.\n")

        elif choice == "4":
            print("===========================================")
            print("🙏 Thank you for using PYTHON BANK ATM.")
            print("Please collect your card. Have a great day!")
            print("===========================================\n")
            break

        else:
            print("⚠️\Invalid choice. Please select a valid option.\n")


# -------------------- Main Menu --------------------

def main():
    while True:
        print("\n===========================================")
        print("        🏦 PYTHON BANK MAIN MENU 🏦         ")
        print("===========================================")
        print("1. Create a New Account")
        print("2. Access Existing Account")
        print("3. Exit")

        user_choice = input("Enter your choice (1-3): ")

        if user_choice == "1":
            create_account()
        elif user_choice == "2":
            atm_session()
        elif user_choice == "3":
            print("🙏 Thank you for visiting Python Bank. Goodbye!\n")
            break
        else:
            print("⚠️ Invalid input. Please select 1, 2, or 3.\n")


# -------------------- Run Program --------------------
if __name__ == "__main__":
    main()
