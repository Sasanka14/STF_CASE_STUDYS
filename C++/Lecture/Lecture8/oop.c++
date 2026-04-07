#include <iostream>
using namespace std;
class Amount{
    int balance;

public:
    void setBalance(int amt){
        balance =amt;
    }
    int getBalance(){
        return balance;
    }
};

int main(){
    Amount myaccount;
    myaccount.setBalance(4900);
    std::cout << myaccount.getBalance() << std::endl;
    return 0;
}