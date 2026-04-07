// Print an integer using class
#include <iostream>
using namespace std;

class Number{
    int a = 77;
    int b = 88;

public:
    void display(){
        cout << "Number: " << (a+b) << endl;
    } 
};

int main(){
    Number num;
    num.display();
}