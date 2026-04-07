/*Q7,HOLLOW RHOMBUS pattern. */
import java.util.Scanner;

public class HollowRhombusPattern {

    // Function to print the hollow rhombus pattern
    public static void printHollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces inside the rhombus
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the rhombus
        System.out.print("Enter the size of the rhombus: ");
        int n = scanner.nextInt();

        // Call the function to print the hollow rhombus pattern
        printHollowRhombus(n);

        scanner.close();
    }
}
