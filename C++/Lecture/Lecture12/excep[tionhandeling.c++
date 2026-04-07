// Exception handling in C++
#include <iostream>
using namespace std;
int main() {
    try
    {
        int age = 21;
        if (age >= 18) {
            cout << "Access granted." << endl;
        } else {
            throw age;    
        }
    }
    catch(int myNum)
    {
       cout << "Access denied. Age must be less than 18." << endl;
       cout << "Age is : " << myNum << endl;
    }
    return 0;
}