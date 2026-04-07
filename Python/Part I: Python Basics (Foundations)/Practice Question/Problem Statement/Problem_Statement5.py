"""Write a Program to calculate the Library Fine for late return of books based on the following criteria:
1.The Program should take the following inputs from the user:
   a. Number of days the book is late.
   b. Type of book (Regular, New Release, Reference).
2.The fine structure is as follows:
   a. Regular Books: Rs 50 per day late.
   b. New Release Books: Rs 100 per day late.
   c. Reference Books: Rs 200 per day late.
3.The program should calculate the total fine by multiplying the number of late days with the corresponding fine rate.
4.The program must then display the total fine in a user-friendly format such as:

 Total fine for returning a <book type> book <n> days late is ₹<amount>.
 
5.If the user enters an invalid book type, the program should display an appropriate error message, such as:

 Invalid book type. Please enter Regular, New Release, or Reference.

6.Optionally, if the total fine amount exceeds ₹1000, the program should apply a 10% discount and display the final payable amount after discount."""

# Library Management System
def calculate_fine(days_late: int, book_type: str) -> float:
    """Calculate fine based on book type and days late."""
    fine_rates = {
        "regular": 50,
        "new release": 100,
        "reference": 200
    }

    book_type_lower = book_type.strip().lower()
    if book_type_lower not in fine_rates:
        print("Invalid book type. Please enter Regular, New Release, or Reference.")
        return None

    fine_rate = fine_rates[book_type_lower]
    total_fine = days_late * fine_rate

    # Apply 10% discount if total exceeds ₹1000
    if total_fine > 1000:
        discount = total_fine * 0.10
        total_fine -= discount
        print(f"\n Total fine before discount: ₹{days_late * fine_rate:.2f}")
        print(f" Discount applied (10%): ₹{discount:.2f}")
        print(f" Final payable amount: ₹{total_fine:.2f}")
    else:
        print(f"\n Total Fine: ₹{total_fine:.2f}")

    return total_fine


def borrow_book(borrowed_books: list) -> None:
    """Allow a student to borrow a new book."""
    print("\n === Borrow a Book ===")
    student_name = input("Enter student name: ").strip().title()
    title = input("Enter the book title: ").strip().title()
    book_type = input("Enter the type of book (Regular / New Release / Reference): ").strip().title()

    borrowed_books.append({
        "student": student_name,
        "title": title,
        "type": book_type,
        "status": "Borrowed"
    })

    print(f"\n{student_name} has successfully borrowed '{title}' ({book_type}) book.")
    print("Please return it within the due date to avoid fines.")


def view_borrowed_books(borrowed_books: list) -> None:
    """Display all borrowed books with student names."""
    print("\n === Borrowed Books List ===")
    if not borrowed_books:
        print("No books borrowed yet.")
        return

    for i, book in enumerate(borrowed_books, 1):
        print(f"{i}. {book['title']} ({book['type']}) - Borrowed by: {book['student']} - Status: {book['status']}")


def return_book(borrowed_books: list) -> None:
    """Return a borrowed book and calculate fine."""
    print("\n === Return a Book ===")
    if not borrowed_books:
        print("No borrowed books found!")
        return

    view_borrowed_books(borrowed_books)

    try:
        choice = int(input("\nEnter the number of the book you want to return: "))
        if choice < 1 or choice > len(borrowed_books):
            print("Invalid book selection.")
            return
    except ValueError:
        print("Invalid input! Please enter a numeric value.")
        return

    selected_book = borrowed_books[choice - 1]
    if selected_book["status"] == "Returned":
        print(f"'{selected_book['title']}' is already returned by {selected_book['student']}.")
        return

    try:
        days_late = int(input(f"Enter number of days '{selected_book['title']}' (borrowed by {selected_book['student']}) is late: "))
        if days_late < 0:
            print("Number of days cannot be negative.")
            return
    except ValueError:
        print("Invalid input! Please enter a numeric value for days.")
        return

    fine = calculate_fine(days_late, selected_book["type"])
    if fine is not None:
        selected_book["status"] = "Returned"
        print(f"\n📘 Total fine for {selected_book['student']} returning '{selected_book['title']}' "
              f"({selected_book['type']}) {days_late} days late is ₹{fine:.2f}.")
        print("Thank you for returning your book! 📖")


def main():
    borrowed_books = []
    while True:
        print("\n=== 🏛️ Library Fine Management System ===")
        print("1️⃣ Borrow a Book")
        print("2️⃣ View Borrowed Books")
        print("3️⃣ Return a Book")
        print("4️⃣ Exit")

        choice = input("\nEnter your choice (1-4): ").strip()
        
        if choice == "1":
            borrow_book(borrowed_books)
        elif choice == "2":
            view_borrowed_books(borrowed_books)
        elif choice == "3":
            return_book(borrowed_books)
        elif choice == "4":
            print("\n Exiting Library Fine System. Have a great day!")
            break
        else:
            print("Invalid choice! Please select from 1 to 4.")


# Run the System
if __name__ == "__main__":
    main()
