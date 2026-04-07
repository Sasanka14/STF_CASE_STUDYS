// recursive factorial function in C++
#include <iostream>
using namespace std;
int factorial(int n) {
    if (n <= 1) {
        return 1; 
    } else {
        return n * factorial(n - 1); 
    }
}
int main() {
    int number = 1;
    cout << "Factorial is " << factorial(number) << endl;
    return 0;
}