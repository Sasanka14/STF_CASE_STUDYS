// Example on Exit Statement in C++
#include <iostream>
#include <cstdlib> // Required for exit()
using namespace std;
int main() {
    int n =  -100;

    if(n < 0) {
        cout << "Negative number entered. Exiting the program." << endl;
        exit(0); // Exit the program
    }

    cout << "You entered: " << n << endl;
 
    return 0;
}