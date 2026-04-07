// For Loop Example in C++ in reverse order
#include <iostream>
using namespace std;
int main() {
    int n;
    cout << "Enter a positive integer: ";
    cin >> n;

    cout << "Numbers from " << n << " to 1 are:" << endl;
    for(int i = n; i >= 1; i--) {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}
