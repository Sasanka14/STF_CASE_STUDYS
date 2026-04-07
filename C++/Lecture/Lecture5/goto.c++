// GoTo Statement in C++
#include <iostream>
using namespace std;
int main() {
    int n = 199;


    if(n <= 0) {
        cout << n << "";
        goto end; // Jump to the end label
    }

    cout << "You entered: " << n << endl;

end:
    cout << "Program ended." << endl;
    return 0;
}