/*Q2. Inverted & Rotated HALF-PYRAMID. */
import java.util.Scanner;

public class InvertedRotatedHalfPyramid {

    // Function to print inverted and rotated half pyramid with gaps
    public static void printInvertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for a gap
            }
            // Print stars with gaps
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the height of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int n = scanner.nextInt();

        // Call the function to print the inverted and rotated half pyramid
        printInvertedRotatedHalfPyramid(n);

        scanner.close();
    }
}
