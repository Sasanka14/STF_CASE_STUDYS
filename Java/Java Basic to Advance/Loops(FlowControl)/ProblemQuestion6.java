/*Q6. Keep Entering Numbers Until User Enters a Multiple of 10 (Using break Statement) */
import java.util.Scanner;

public class ProblemQuestion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Keep asking for numbers until the user enters a multiple of 10
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number % 10 == 0) {
                System.out.println("You entered a multiple of 10. Exiting program.");
                break; // Exit the loop if the number is a multiple of 10
            }
        }

        scanner.close();
    }
}
