// Example of using break statement in C++
#include <iostream>
using namespace std;
int main() {
    int n = 100;

    cout << "Numbers from 1 to " << n << " (stopping at 5):" << endl;
    for(int i = 1; i <= n; i++) {
        if(i == 5) {
            break; 
        }
        cout << i << " ";
    }
    cout << endl;

    return 0;
}