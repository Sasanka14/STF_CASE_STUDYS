/*Q4. 0s -1s Triangle. */
import java.util.Scanner;

public class ZeroOneTriangle {

    // Function to print the 0-1 triangle
    public static void printZeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Calculate the value to print based on the sum of i and j
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the height of the triangle
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Call the function to print the 0-1 triangle
        printZeroOneTriangle(n);

        scanner.close();
    }
}
