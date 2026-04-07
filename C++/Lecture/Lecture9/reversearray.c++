// reverses the array element
#include<iostream>
using namespace std;
int main(){ 
    int n[5] = {10,30,70,80,90};
    for (int i = 4; i >=0; i--)
    { 
       cout << "Largest Element: " << n[i] << endl;
    }
    
    return 0;
}