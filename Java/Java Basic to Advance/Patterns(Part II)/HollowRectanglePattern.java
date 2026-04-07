/*Q1. Print HOLLOW RECTANGLE pattern. */
import java.util.Scanner;

public class HollowRectanglePattern {

    // Function to print hollow rectangle pattern with gaps
    public static void printHollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the borders, otherwise print space
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the dimensions of the rectangle
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Call the function to print the hollow rectangle
        printHollowRectangle(rows, cols);

        scanner.close();
    }
}
