// Check Even or Odd using OOP
#include <iostream> 
using namespace std;
class oddeven {
    int number = 4;
public:
    void checkEvenOdd() {
        if (number % 2 == 0) {
            cout << number << " is Even" << endl;
        } else {
            cout << number << " is Odd" << endl;
        }
    }
};
int main() {
    oddeven obj;
    obj.checkEvenOdd();
    return 0;
}