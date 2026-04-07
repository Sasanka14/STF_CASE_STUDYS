/*Q9.Write a Java method to compute the sum of the digits in an integer.
    (Hint: Approach this question in the following way:
        a.Take a variable sum = 0
        b.Find the last digit of the number
        c.Add it to the sum
        d.Repeat a & b until the number becomes 0 ) */
import java.util.Scanner;

public class ProblemQuestion9 {

    // Method to compute the sum of the digits in an integer
    public static int sumOfDigits(int number) {
        int sum = 0; // Initialize sum to 0

        while (number != 0) {
            // Find the last digit of the number
            int lastDigit = number % 10;

            // Add the last digit to the sum
            sum += lastDigit;

            // Remove the last digit from the number
            number /= 10;
        }

        return sum; // Return the computed sum of the digits
    }

    // Method to get user input and call the sumOfDigits method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the sumOfDigits method and print the result
        int result = sumOfDigits(number);
        System.out.println("The sum of the digits in " + number + " is: " + result);

        scanner.close(); // Close the scanner
    }
}
