/*Q7. Write a Java program to get a number from the user and print whether it is positive or negative. */
import java.util.Scanner;

public class ProblemQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the user input

        // Check if the number is positive, negative, or zero
        String result;
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "neither positive nor negative";
        }

        // Print the result
        System.out.println("The number is " + result + ".");

        scanner.close(); // Close the scanner
    }
}
