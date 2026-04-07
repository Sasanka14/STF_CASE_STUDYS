/*Q3. Write a program to Find Transpose of a Matrix.
      What is Transpose?
      Transpose of a matrix is the process of swapping the rows to columns.
      For Example: 
      For a 2x3 matrix,
      Matrix 
      a11    a12    a13
      a21    a22    a23
      Transposed Matrix
      a11    a21
      a12    a22
      a13    a23
*/
import java.util.Scanner;

public class ProblemQuestion3 {

    // Function to calculate the transpose of the matrix
    public static int[][] transposeMatrix(int[][] matrix, int n, int m) {
        int[][] transpose = new int[m][n];  // Transposed matrix will have dimensions m x n

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];  // Swap rows with columns
            }
        }
        return transpose;
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    // Function to take input for the matrix
    public static int[][] takeMatrixInput() {
        Scanner scanner = new Scanner(System.in);

        // Input: dimensions of the matrix
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        // Input: matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        // Take matrix input from user
        int[][] matrix = takeMatrixInput();

        // Get dimensions of the matrix
        int n = matrix.length;
        int m = matrix[0].length;

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Calculate the transpose of the matrix
        int[][] transposedMatrix = transposeMatrix(matrix, n, m);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }
}
