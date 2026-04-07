/*Q5.BUTTERFLY pattern */
import java.util.Scanner;

public class ButterflyPattern {

    // Function to print the butterfly pattern
    public static void printButterflyPattern(int n) {
        // Print the upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the height of the butterfly
        System.out.print("Enter the height of the butterfly: ");
        int n = scanner.nextInt();

        // Call the function to print the butterfly pattern
        printButterflyPattern(n);

        scanner.close();
    }
}
