/* Q. An Evil Number is a number which contains even number of 1’s in its binary 
equivalent. 
Example: Binary equivalent of 10 = 1010 which contains even number on 1’s. 
 Thus, 10 is an Evil Number. 
Design a class Evil to check if a given number is an Evil number or not. Some of the 
members of the class are given below: . 
[10]
Class name : Evil
Data members/instance variables:
nnum : to store a positive integer number
bin : to store the binary equivalent 
Methods / Member functions:
Evil( ) : default constructor to initialize the data member 
with legal initial value
void acceptNum( ) : to accept a positive integer number
void rec_bin (int x) : to convert the decimal number into its binary
equivalent using recursive technique
void check( ) : to check whether the given number is an Evil
number by invoking the function rec_bin() and 
to display the result with an appropriate 
message
Specify the class Evil giving details of the constructor( ), void acceptNum( ), 
void rec_bin(int) and void check( ). Define a main( ) function to create an object and call 
all the functions accordingly to enable the task. */
//-------------------------------------------------------------------------------SOLUTION-----------------------------------------------------------------------------------------
import java.util.Scanner;

public class Evil {
    private int num;
    private String bin;

    public Evil() {
        num = 0;
        bin = "";
    }

    public void acceptNum() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number: ");
            
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                
                if (num > 0) {
                    break;                                                          // Exit the loop if a positive integer is provided
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();  // Consume the invalid input
            }
        }
    }

    public void rec_bin(int x) {
        if (x > 1) {
            rec_bin(x / 2);
        }
        bin += Integer.toString(x % 2);
    }

    public void check() {
        bin = ""; // Reset binary representation
        rec_bin(num);
        int countOnes = bin.replace("0", "").length();

        if (countOnes % 2 == 0) {
            System.out.println(num + " is an Evil Number.");
        } else {
            System.out.println(num + " is not an Evil Number.");
        }
    }

    public static void main(String[] args) {
        Evil evilObj = new Evil();
        evilObj.acceptNum();
        evilObj.check();
    }
}
