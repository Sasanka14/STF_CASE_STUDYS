/*Q7. Display All Numbers Entered by User Except Multiples of 10 (Using continue Statement) */
import java.util.Scanner;

public class ProblemQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Inform user about the functionality of the program
        System.out.println("Enter numbers (multiple of 10 will be skipped):");

        // Loop to keep asking for numbers until user enters a multiple of 10
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the number is a multiple of 10
            if (number % 10 == 0) {
                // Skip the current iteration if the number is a multiple of 10
                continue;
            }

            // Display the number if it is not a multiple of 10
            System.out.println("You entered: " + number);
        }
    }
}
