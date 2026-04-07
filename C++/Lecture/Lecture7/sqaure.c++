// Write a program to calculate square of a number using function without argument
#include <iostream>
using namespace std;
int printSquare() {
    int num = 6;
    return num*num;
}
int main() {
    int result = printSquare(); 
    cout << "Square of 6 is " << result << endl;
    return 0;
}