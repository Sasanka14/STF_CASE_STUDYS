// Sorting 
#include <iostream>
using namespace std;
int main() {
    int n[5] = {70, 10, 90, 30, 80};
    for (int i = 0; i < 5 - 1; i++) {
        for (int j = 0; j < 5 - i - 1; j++) {
            if (n[j] > n[j + 1]) {
                int temp = n[j];
                n[j] = n[j + 1];
                n[j + 1] = temp;
            }
        }
    }
    cout << "Sorted Array: ";
    for (int i = 0; i < 5; i++) {
        cout << n[i] << " ";
    }
    cout << endl;

    return 0;
}