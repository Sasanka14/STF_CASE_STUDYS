// recursion  Fibonacci numbers
#include <iostream>
using namespace std;
int fibonacci(int n) {
    if (n <= 0) {
        return 0; 
    } else if (n == 1) {
        return 1; 
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}
int main() {
    int number = 6;
    for (int i = 0; i < number; i++) {
        cout << fibonacci(i) << endl;
    }
    return 0; 
}