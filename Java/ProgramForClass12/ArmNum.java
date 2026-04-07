/* Q. Design a class ArmNum to check if a given number is an Armstong number or not.
 ArmNum :- [A number is said to be Armstrong if sum of its digits raised to power of length of the number is equal to the number.]
           Example: 
                    371   = 3^3 + 7^3 + 1^3
                    1634  = 1^4 + 6^4 + 3^4 + 4^4 
                    54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5
            Thus, 371, 1634, 54748 are all example of Armstrong numbers.
Some of the members of the class are given below:
Class Name                                      : ArmNum
Data Members / Instance Variables
n                                               : to store the number 
l                                               : to store the length of the number 
Methods / Member Functions
ArmNum(int nn)                                  : parameterised constructor to initialise the data member n = nn
int sum_pow(int i)                              : return the sum of each digit raised to power of the power of the length of the number using recursive technique 
                                                  E.g. , 34 will return 3^2 + 4^2(as the length of the number is 2)
void is Armstrong()                             : checks weather the given number is an Armstrong number by invoking the function sum_pow() and display the result 
                                                  with an appropriate message.    
Specify the class ArmNum giving details of the constructor(), int sum_pow(int) and void is Armstrong(). Define a main() function to create an object and call the 
functions accordingly to enable the task. */
//------------------------------------------------------------------SOLUTION---------------------------------------------------------------------------------------
import java.util.Scanner;

public class ArmNum {
    private int n;
    private int l;

    // Parameterized constructor to initialize n
    public ArmNum(int nn) {
        n = nn;
        l = findLength(n);
    }

    // Function to find the length of the number
    private int findLength(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Recursive function to calculate the sum of digits raised to the power of length
    private int sumPow(int i) {
        if (i == 0) {
            return 0;
        } else {
            int digit = i % 10;
            return (int) Math.pow(digit, l) + sumPow(i / 10);
        }
    }

    // Function to check if the number is an Armstrong number
    public void isArmstrong() {
        int sum = sumPow(n);

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an object of the ArmNum class
        ArmNum obj = new ArmNum(number);

        // Call isArmstrong() to check if the number is an Armstrong number
        obj.isArmstrong();
    }
}
