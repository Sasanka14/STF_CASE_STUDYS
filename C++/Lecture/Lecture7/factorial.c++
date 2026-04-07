#include <iostream>
using namespace std;

int calculateFactorial() {
    int num = 6;
    int factorial = 1;
   if (num >= 0) { 
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        
    }
    return factorial; 
}

int main() {
    int result = calculateFactorial();
    cout << "Factorial of 6 is " << result << endl;
    return 0;
}