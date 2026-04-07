//Q1. Write a program in C++ to check whether a given character is a vowel or consonant. Using Switch Case Statement.
#include <iostream>
using namespace std;
int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    char lowerCh = tolower(ch);
    switch(lowerCh) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            cout << ch << " is a Vowel." << endl;
            break;
        default:
            cout << ch << " is a Consonant." << endl;
    }

    return 0;
}