/*  Q. Design a class Renvo which reverses an integer number. 
       Example :
                94765 becomes 56749 on reversing the digits of the number.
Some of the members of the class are given below:
Class Nmae                                      : Renvo
Data Member / Instance variable
num                                             : to store the integer number
Member Functions / methods
Renvo()                                         : default constructor
void inputnum                                   : to accept the number
int reverse(int nn)                             : return the reverse of a number by using recursive techniques
void display()                                  : displays the original number along with its reverse by invoking the method reverse()
Specify the class Renvo, giving details of the constructor, void inputnum(), int reverse(int) and void display(). Define the main() function
 to create an object and call the functions accordingly to enable the task.*/
//---------------------------------------------------------------SOLUTION----------------------------------------------------------------------------
import java.util.Scanner;

public class Renvo {
    private int num;

    // Default constructor
    public Renvo() {
        num = 0;
    }

    // Function to accept the number
    public void inputnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        num = scanner.nextInt();
    }

    // Recursive function to reverse the number
    public int reverse(int nn) {
        if (nn == 0) {
            return 0;
        } else {
            return (nn % 10) * (int) Math.pow(10, Math.floor(Math.log10(nn))) + reverse(nn / 10);
        }
    }

    // Display original and reversed numbers
    public void display() {
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverse(num));
    }

    public static void main(String[] args) {
        // Create an object of the Renvo class
        Renvo obj = new Renvo();

        // Call the inputnum() method to accept the number
        obj.inputnum();

        // Call the display() method to display the original and reversed numbers
        obj.display();
    }
}
