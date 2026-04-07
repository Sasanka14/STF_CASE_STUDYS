/*Q8.DIAMOND pattern. */
import java.util.Scanner;

public class DiamondShapePattern {

    // Function to print the diamond pattern
    public static void printDiamond(int n) {
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for gap
            }
            // Print stars with gaps
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for gap
            }
            // Print stars with gaps
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the diamond
        System.out.print("Enter the size of the diamond: ");
        int n = scanner.nextInt();

        // Call the function to print the diamond pattern
        printDiamond(n);

        scanner.close();
    }
}
