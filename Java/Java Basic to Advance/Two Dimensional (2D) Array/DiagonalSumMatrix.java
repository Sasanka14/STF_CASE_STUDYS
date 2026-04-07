/*Write a Java program to compute the sum of the main and secondary diagonals in an n x n square matrix. The matrix elements and size should be provided by the user. Implement separate functions for input, display, and calculating the diagonal sums. */
import java.util.Scanner;

public class DiagonalSumMatrix {

    // Function to take user input for the matrix
    public static int[][] takeInput(int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to display the matrix
    public static void displayMatrix(int[][] matrix) {
        System.out.println("Your matrix is:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate the diagonal sum
    public static int[] calculateDiagonalSums(int[][] matrix, int n) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];               // Main diagonal
            secondaryDiagonalSum += matrix[i][n - 1 - i];  // Secondary diagonal
        }

        return new int[] {mainDiagonalSum, secondaryDiagonalSum};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows/columns
        System.out.println("Enter the number of rows/columns for the matrix (n x n): ");
        int n = scanner.nextInt();

        // Input matrix
        int[][] matrix = takeInput(n);

        // Display matrix
        displayMatrix(matrix);

        // Calculate diagonal sums
        int[] diagonalSums = calculateDiagonalSums(matrix, n);
        int mainDiagonalSum = diagonalSums[0];
        int secondaryDiagonalSum = diagonalSums[1];

        // Display sums
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        System.out.println("Total diagonal sum: " + (mainDiagonalSum + secondaryDiagonalSum));
    }
}
