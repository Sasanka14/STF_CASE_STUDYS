/* Q2. Print if number is ODD or EVEN by using if-else statement. */
import java.util.Scanner;
public class ProblemQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read the user input

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close(); // Close the scanner
    }
}
