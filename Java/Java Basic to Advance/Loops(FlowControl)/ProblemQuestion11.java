/*Q11. Write a program to print the multiplication table of a number N,entered by the User.*/
import java.util.Scanner;

public class ProblemQuestion11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input

        System.out.print("Enter a number: ");
        int N = scanner.nextInt(); // Read the user input for the number N

        System.out.println("Multiplication table of " + N + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i)); // Print the multiplication table
        }
        
        scanner.close(); // Close the scanner
    }
}
