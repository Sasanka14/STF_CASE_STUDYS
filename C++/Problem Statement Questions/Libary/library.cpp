#include <iostream>
#include <fstream>
#include <string>
using namespace std;

// BOOK CLASS

class Book {
public:
    int bookID;
    string title;
    string author;
    bool issued;
    int issuedTo; // student ID

    void displayBook() {
        cout << "\nBook ID: " << bookID;
        cout << "\nTitle: " << title;
        cout << "\nAuthor: " << author;
        cout << "\nStatus: " << (issued ? "Issued" : "Available");
        if (issued)
            cout << "\nIssued To Student ID: " << issuedTo;
        cout << "\n-------------------------\n";
    }

    void writeToFile(ofstream &out) {
        out << bookID << endl;
        out << title << endl;
        out << author << endl;
        out << issued << endl;
        out << issuedTo << endl;
    }

    void readFromFile(ifstream &in) {
        in >> bookID;
        in.ignore();
        getline(in, title);
        getline(in, author);
        in >> issued;
        in >> issuedTo;
        in.ignore();
    }
};

// STUDENT CLASS

class Student {
public:
    int studentID;
    string name;
    string password;

    void inputStudent() {
        cout << "\nEnter Student ID: ";
        cin >> studentID;
        cin.ignore();

        cout << "Enter Name: ";
        getline(cin, name);

        cout << "Set Password: ";
        getline(cin, password);
    }

    void writeToFile(ofstream &out) {
        out << studentID << endl;
        out << name << endl;
        out << password << endl;
    }

    void readFromFile(ifstream &in) {
        in >> studentID;
        in.ignore();
        getline(in, name);
        getline(in, password);
    }
};

// INITIAL 50 BOOKS
void initializeBooks() {
    ifstream check("library.txt");
    if (check.good()) return; // already exists
    check.close();

    string titles[50] = {
        "Data Structures and Algorithms",
        "Operating System Concepts",
        "Computer Networks",
        "The C++ Programming Language",
        "Database System Concepts",
        "Artificial Intelligence Basics",
        "Machine Learning Foundations",
        "Digital Logic Design",
        "Software Engineering Principles",
        "Object Oriented Programming",
        "Introduction to Python",
        "Web Development with HTML and CSS",
        "Java Programming Guide",
        "Discrete Mathematics",
        "Computer Organization and Architecture",
        "Unix and Shell Programming",
        "Cyber Security Essentials",
        "Cloud Computing Basics",
        "Big Data Analytics",
        "Introduction to JavaScript",
        "ReactJS Fundamentals",
        "NodeJS in Practice",
        "MongoDB Guide",
        "Full Stack Web Development",
        "Advanced C Programming",
        "Programming in ANSI C",
        "Compiler Design",
        "Theory of Computation",
        "Numerical Methods",
        "Linear Algebra",
        "Probability and Statistics",
        "Data Mining Concepts",
        "Deep Learning Introduction",
        "Computer Graphics",
        "Human Computer Interaction",
        "Mobile App Development",
        "Android Programming",
        "iOS Development Basics",
        "Blockchain Technology",
        "Internet of Things",
        "Embedded Systems",
        "Microprocessors and Microcontrollers",
        "Software Testing Techniques",
        "Agile Project Management",
        "DevOps Fundamentals",
        "AWS Cloud Practitioner",
        "System Design Basics",
        "Competitive Programming Handbook",
        "Problem Solving with C++",
        "Introduction to Algorithms"
    };

    string authors[50] = {
        "Thomas H. Cormen",
        "Abraham Silberschatz",
        "Andrew S. Tanenbaum",
        "Bjarne Stroustrup",
        "Korth and Sudarshan",
        "Stuart Russell",
        "Tom Mitchell",
        "Morris Mano",
        "Ian Sommerville",
        "Grady Booch",
        "Guido van Rossum",
        "Jon Duckett",
        "Herbert Schildt",
        "Kenneth Rosen",
        "William Stallings",
        "Yashavant Kanetkar",
        "William Stallings",
        "Rajkumar Buyya",
        "Viktor Mayer-Schonberger",
        "Brendan Eich",
        "Jordan Walke",
        "Ryan Dahl",
        "Dwight Merriman",
        "Brad Traversy",
        "Dennis Ritchie",
        "B.W. Kernighan",
        "Aho and Ullman",
        "Michael Sipser",
        "Steven Chapra",
        "Gilbert Strang",
        "Sheldon Ross",
        "Jiawei Han",
        "Ian Goodfellow",
        "Donald Hearn",
        "Alan Dix",
        "Charlie Collins",
        "Bill Phillips",
        "AppCoda",
        "Satoshi Nakamoto",
        "Kevin Ashton",
        "Raj Kamal",
        "Ramesh Gaonkar",
        "Glenford Myers",
        "Ken Schwaber",
        "Gene Kim",
        "Amazon",
        "Alex Xu",
        "Antti Laaksonen",
        "Walter Savitch",
        "Thomas H. Cormen"
    };

    ofstream out("library.txt");

    for (int i = 0; i < 50; i++) {
        out << i + 1 << endl;
        out << titles[i] << endl;
        out << authors[i] << endl;
        out << 0 << endl;   // not issued
        out << -1 << endl;  // no student
    }

    out.close();
}


// STUDENT REGISTER

void registerStudent() {
    Student s;
    ofstream out("students.txt", ios::app);

    s.inputStudent();
    s.writeToFile(out);

    out.close();
    cout << "\n✅Student registered successfully!\n";
}

// STUDENT LOGIN

bool loginStudent(int &loggedID) {
    int id;
    string pass;
    bool found = false;

    cout << "\nEnter Student ID: ";
    cin >> id;
    cin.ignore();

    cout << "Enter Password: ";
    getline(cin, pass);

    ifstream in("students.txt");
    Student s;

    while (in.peek() != EOF) {
        s.readFromFile(in);
        if (s.studentID == id && s.password == pass) {
            found = true;
            loggedID = id;
            break;
        }
    }

    in.close();

    if (!found)
        cout << "\nInvalid credentials!\n";

    return found;
}

// DISPLAY BOOKS

void displayBooks() {
    ifstream in("library.txt");
    Book b;

    while (in.peek() != EOF) {
        b.readFromFile(in);
        b.displayBook();
    }

    in.close();
}

// SEARCH BOOK

void searchBook() {
    int id;
    bool found = false;

    cout << "\nEnter Book ID: ";
    cin >> id;

    ifstream in("library.txt");
    Book b;

    while (in.peek() != EOF) {
        b.readFromFile(in);
        if (b.bookID == id) {
            b.displayBook();
            found = true;
            break;
        }
    }

    if (!found)
        cout << "\nBook not found!\n";

    in.close();
}

// ISSUE BOOK

void issueBook(int studentID) {
    int id;
    bool found = false;

    cout << "\nEnter Book ID to issue: ";
    cin >> id;

    ifstream in("library.txt");
    ofstream out("temp.txt");
    Book b;

    while (in.peek() != EOF) {
        b.readFromFile(in);

        if (b.bookID == id && !b.issued) {
            b.issued = true;
            b.issuedTo = studentID;
            found = true;
            cout << "\nBook issued successfully!\n";
        }

        b.writeToFile(out);
    }

    in.close();
    out.close();

    remove("library.txt");
    rename("temp.txt", "library.txt");

    if (!found)
        cout << "\nBook not available!\n";
}

// RETURN BOOK

void returnBook(int studentID) {
    int id;
    bool found = false;

    cout << "\nEnter Book ID to return: ";
    cin >> id;

    ifstream in("library.txt");
    ofstream out("temp.txt");
    Book b;

    while (in.peek() != EOF) {
        b.readFromFile(in);

        if (b.bookID == id && b.issued && b.issuedTo == studentID) {
            b.issued = false;
            b.issuedTo = -1;
            found = true;
            cout << "\nBook returned successfully!\n";
        }

        b.writeToFile(out);
    }

    in.close();
    out.close();

    remove("library.txt");
    rename("temp.txt", "library.txt");

    if (!found)
        cout << "\nReturn failed!\n";
}

// MAIN

int main() {
    initializeBooks();

    int choice, studentID;

    do {
        cout << "\n====== LIBRARY SYSTEM ======\n";
        cout << "1. Register Student\n";
        cout << "2. Student Login\n";
        cout << "3. Display Books\n";
        cout << "4. Search Book\n";
        cout << "0. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            registerStudent();
            break;

        case 2:
            if (loginStudent(studentID)) {
                int ch;
                do {
                    cout << "\n--- Student Menu ---\n";
                    cout << "1. Issue Book\n";
                    cout << "2. Return Book\n";
                    cout << "0. Logout\n";
                    cout << "Enter choice: ";
                    cin >> ch;

                    if (ch == 1) issueBook(studentID);
                    else if (ch == 2) returnBook(studentID);

                } while (ch != 0);
            }
            break;

        case 3:
            displayBooks();
            break;

        case 4:
            searchBook();
            break;
        }

    } while (choice != 0);

    return 0;
}
