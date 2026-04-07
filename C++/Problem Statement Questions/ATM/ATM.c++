// Design a C++ program to simulate an ATM machine that allows users to perform basic banking operations such as depositing money, withdrawing money, and checking the balance. The program should use classes and objects
#include <iostream>
using namespace std;
class ATM {
    double balance;
public:
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposited: ₹" << amount << endl;
        } else {
            cout << "Invalid deposit amount!" << endl;
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Withdrew: ₹" << amount << endl;
        } else {
            cout << "Invalid withdraw amount or insufficient balance......" << endl;
        }
    }
    double checkBalance() {
        return balance;
    }
};  
int main() {
    ATM myATM;
    myATM.deposit(500);
    myATM.withdraw(200);
    cout << "Current Balance: ₹" << myATM.checkBalance() << endl;
    return 0;
}