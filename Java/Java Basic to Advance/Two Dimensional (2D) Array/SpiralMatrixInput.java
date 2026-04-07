/*Write a Java program to input a 2D matrix from the user and print its elements in spiral order. The program should take the matrix's dimensions (rows and columns) and the elements as input, then display the matrix elements in a spiral sequence. */
import java.util.Scanner;

public class SpiralMatrixInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][columns];

        // Taking input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the input matrix
        System.out.println("Your matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the matrix in spiral order
        System.out.println("Spiral order of the matrix:");
        printSpiral(matrix, rows, columns);
    }

    // Function to print matrix in spiral order
    public static void printSpiral(int[][] matrix, int rows, int columns) {
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        while (top <= bottom && left <= right) {
            // Print the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
