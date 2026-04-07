/* Q5. Product of a & b  */
import java.util.Scanner; // Import the Scanner class

public class JavaBasicProblemQuestion5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for reading input

        // Prompt and read the first integer from the user
        System.out.print("Enter the first number (a): ");
        int a = in.nextInt();

        // Prompt and read the second integer from the user
        System.out.print("Enter the second number (b): ");
        int b = in.nextInt();

        // Calculate the product of a and b
        int product = a * b;

        // Print the product
        System.out.println("Product of a and b is " + product);
        
        // Close the scanner
        in.close();
    }
}
