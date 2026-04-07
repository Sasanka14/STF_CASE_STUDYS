// Q2. Print numbers from 1 to n.

import java.util.Scanner;

public class ProblemQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // Read the user input for n

        int i = 1; // Initialize the counter variable

        // Start the while loop
        while (i <= n) { // Condition to run the loop
            System.out.println(i); // Print the current value of i
            i++; // Increment the counter variable
        }

        scanner.close(); // Close the scanner
    }
}
