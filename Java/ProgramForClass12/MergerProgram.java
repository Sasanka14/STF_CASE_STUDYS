/* Q. A class Merger concatenates two positive integer that are greater than zero and produced new merged integer.
      Write a program to achive the above task.*/
//---------------------------------------------------------------SOLUTION---------------------------------------------------------------------------
import java.util.Scanner;

public class MergerProgram {
    public static void main(String[] args) {
        // Input two positive integers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        // Validate input
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error: Please enter positive integers greater than zero.");
            return;
        }

        // Create an instance of the Merger class
        Merger mergerObj = new Merger();

        // Merge and display the result
        int mergedNumber = mergerObj.mergeNumbers(num1, num2);
        System.out.println("Merged Number: " + mergedNumber);
    }
}

class Merger {
    // Function to merge two positive integers
    public int mergeNumbers(int num1, int num2) {
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        // Concatenate the two integers
        String mergedString = strNum1 + strNum2;

        // Parse the merged string back to an integer
        return Integer.parseInt(mergedString);
    }
}
