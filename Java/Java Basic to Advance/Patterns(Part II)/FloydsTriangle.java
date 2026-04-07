import java.util.Scanner;

public class FloydsTriangle {

    // Function to print Floyd's Triangle
    public static void printFloydsTriangle(int n) {
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows in Floyd's Triangle
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = scanner.nextInt();

        // Call the function to print Floyd's Triangle
        printFloydsTriangle(n);

        scanner.close();
    }
}
