import java.util.Scanner;  // Import the Scanner class

public class JavaBasicProblemQuestion3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);  // Correct capitalization
        System.out.print("Enter the first number: ");
        int a = in.nextInt();  // Read the first integer from user input
        System.out.print("Enter the second number: ");
        int b = in.nextInt();  // Read the second integer from user input
        int sum = a + b;  // Calculate the sum of a and b
        System.out.println("Sum of a and b is " + sum);  // Print the result
    }
}
