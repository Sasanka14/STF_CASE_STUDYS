# Concept: Class with methods to update internal state (deposit/withdraw)

class BankAccount:
    def __init__(self, owner, balance=0.0):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print("Deposited:", amount)
        else:
            print("Invalid deposit amount.")

    def withdraw(self, amount):
        if amount <= 0:
            print("Invalid withdraw amount.")
        elif amount > self.balance:
            print("Insufficient balance.")
        else:
            self.balance -= amount
            print("Withdrawn:", amount)

    def check_balance(self):
        print("Current balance:", self.balance)


if __name__ == "__main__":
    name = input("Enter account owner name: ")
    acc = BankAccount(name)

    while True:
        print("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit")
        choice = input("Enter your choice: ")

        if choice == "1":
            amt = float(input("Enter amount to deposit: "))
            acc.deposit(amt)
        elif choice == "2":
            amt = float(input("Enter amount to withdraw: "))
            acc.withdraw(amt)
        elif choice == "3":
            acc.check_balance()
        elif choice == "4":
            break
        else:
            print("Invalid choice.")
