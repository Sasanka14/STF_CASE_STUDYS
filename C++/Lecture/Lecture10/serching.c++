// searching 
#include <iostream>
using namespace std;
int main() {
    int n[5] = {10, 30, 70, 80, 90};
    int target = 90;
    bool found = false;

    for (int i = 0; i < 5; i++) {
        if (n[i] == target) {
            cout << "Element " << target << " found at index " << i << endl;
            found = true;
            break;
        }
    }

    if (!found) {
        cout << "Element " << target << " not found in the array." << endl;
    }

    return 0;
}