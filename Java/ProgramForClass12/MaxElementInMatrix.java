/**
 * Question: Write a Java program to find the maximum element in a user-defined matrix.
 * The program should take the number of rows and columns as input,
 * and then prompt the user to enter the elements of the matrix.
 * Finally, it should display the maximum element in the matrix.
 */

import java.util.Scanner; // Import Scanner class for user input

public class MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the dimensions of the matrix
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        // Step 2: Create a 2D array (matrix) of given dimensions
        int[][] matrix = new int[rows][columns];

        // Step 3: Take input for each element of the matrix
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Find the maximum element in the matrix
        int maxElement = matrix[0][0]; // Initialize with the first element of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) { // Compare current element with maxElement
                    maxElement = matrix[i][j];
                }
            }
        }

        // Step 5: Print the maximum element
        System.out.println("The maximum element in the matrix is: " + maxElement);

        scanner.close(); // Close the scanner to free resources
    }
}
