/*Q3.Inverted HALF-PYRAMID with Numbers. */
import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {

    // Function to print an inverted half pyramid with numbers
    public static void printInvertedHalfPyramidWithNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the height of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int n = scanner.nextInt();

        // Call the function to print the inverted half pyramid with numbers
        printInvertedHalfPyramidWithNumbers(n);

        scanner.close();
    }
}
