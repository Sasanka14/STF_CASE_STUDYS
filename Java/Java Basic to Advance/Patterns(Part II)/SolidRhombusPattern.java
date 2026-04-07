/*Q6.SOLID-RHOMBUS pattern */
import java.util.Scanner;

public class SolidRhombusPattern {

    // Function to print the solid rhombus pattern
    public static void printSolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the rhombus
        System.out.print("Enter the size of the rhombus: ");
        int n = scanner.nextInt();

        // Call the function to print the solid rhombus pattern
        printSolidRhombus(n);

        scanner.close();
    }
}
