#include<iostream>
using namespace std;
int main(){
    int arr [6] = {10,30,70,80,90,70};
    cout << "Numbers : " << arr[4]<<endl;
    cout << "Numbers : " << arr[3]<<endl;
    arr[4] = 100;
    cout << "After Modified Numbers" ;
    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] <<" ";
    }
    return 0;
}