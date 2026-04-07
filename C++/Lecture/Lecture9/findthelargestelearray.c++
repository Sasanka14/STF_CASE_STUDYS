#include<iostream>
using namespace std;
int main(){ 
    int n[5] = {10,30,70,80,90};
    int largest = n[0];
    for (int i = 1; i < 5; i++)
    { 
        if (n[i] > largest){
            largest = n[i];
        }
    }
    cout << "Largest Element : " << largest << endl;
    return 0;
}