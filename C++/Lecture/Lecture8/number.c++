// Print an integer using class
#include <iostream>
using namespace std;

class Number{
    int number = 77;

public:
    void display(){
        cout << "Number: " << number << endl;
    } 
};

int main(){
    Number num;
    num.display();
}