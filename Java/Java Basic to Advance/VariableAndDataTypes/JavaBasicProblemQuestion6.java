/* Q6.In a program, input 3 numbers: A , B and C. You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)  */
import java.util.Scanner; // Import the Scanner class

public class JavaBasicProblemQuestion6 {
    public static void main(String args[]) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number (A): ");
        double A = scanner.nextDouble();
        
        System.out.print("Enter the second number (B): ");
        double B = scanner.nextDouble();
        
        System.out.print("Enter the third number (C): ");
        double C = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (A + B + C) / 3;

        // Print the result
        System.out.println("The average of the numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}
