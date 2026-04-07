# counter_app.py

"""
Concepts:
- functions
- while True loop + menu
- simple state management
"""

def show_menu():
    print("\n=== Counter App ===")
    print("1. Increment")
    print("2. Decrement")
    print("3. Reset")
    print("4. Show value")
    print("5. Exit")


def main():
    counter = 0

    while True:
        show_menu()
        choice = input("Choose an option: ").strip()

        if choice == "1":
            counter += 1
            print("Counter incremented.")
        elif choice == "2":
            counter -= 1
            print("Counter decremented.")
        elif choice == "3":
            counter = 0
            print("Counter reset.")
        elif choice == "4":
            print(f"Current value: {counter}")
        elif choice == "5":
            print("Goodbye.")
            break
        else:
            print("Invalid choice, try again.")


if __name__ == "__main__":
    main()
