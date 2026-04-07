/* Q. Design a calss NumDude to check if a given number is a Dudency number or not.(A Dudency number is a positive interger that is a
       perfect cube, such that the sum of its digits is equal to the cube root of the number.)
       Example: 5832 = Math.cbrt(5 + 8 + 3 + 2)
                     = Math.cbrt(18)
                     = 5832
SOME OF THE MEMBER OF THE CLASS ARE GIVEN BLEOW :
CLASS NAME                                     : NumDude
DATA MEMBER / INSTANCE VARIABLE 
 num                                           : to store a postive integer number
 METHODS / MEMBER FUNCTION 
 NumDude()                                     : default constructor to initilise the data member with legal initial value 
 void input()                                  : to accept a positive integer number
 int sumDigits(intx)                           : returns the sum of the digits of number 'x' using recursive technique
 void isDude()                                 : check weather the given number is a Dudenecy number by invoking the function sumDigits()
                                                 and displays the reasult with an appropritate message.
Specify the class NumDude giving details of the constructor(), void input(), intSumDigits(int) and void isDude(). Define the main function
to creat an object and call the function accordingly to enable the task.     */
//-----------------------------------------------------SOLUTION---------------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;
public class NumDude {
    // Data Member
    private int num;

    // Default Constructor
    public NumDude() {
        num = 0;
    }

    // Member Method to input a positive integer number
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer number:");
        num = in.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            input();                                                               // Recursive call to input a positive number
        }
    }
    // Member Method to calculate the sum of digits using recursion
    private int sumDigits(int x) {
        if (x == 0) {
            return 0;
        }
        return x % 10 + sumDigits(x / 10);
    }
    // Member Method to check if the number is a Dudency number
    public void isDude() {
        int sum = sumDigits(num);
        double cubeRoot = Math.cbrt(sum);

        if (num > 0 && num == cubeRoot * cubeRoot * cubeRoot) {
            System.out.println(num + " is a Dudency number.");
        } else {
            System.out.println(num + " is not a Dudency number.");
        }
    }
    public static void main(String[] args)throws IOException {
        NumDude numDude = new NumDude();
        numDude.input();
        numDude.isDude();
    }
}
