/* Q. Write a program to declare a square matrix A[][] of oder M*M where 'M' is the number of rows and the number of coloumns , Such that M must be greater than 2 and less than 10
Accept the value of M as user input. Display an appropriate message for an invalid input. Allow the user to input integer into this matrix. Perfrom the following task:
A. Display the original Matrix
B. Roate the matrix 90 degree clockwise as shawn:
         Orignial                                      Rotated
         123                                           741
         456                                           852
         789                                           963
C. Find the sum of the elements of the  four corner of the matrix.*/
//-----------------------------------------------------------------------SOLUTION------------------------------------------------------------------------------------------
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        // Input the size of the square matrix
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (M): ");
        int M = scanner.nextInt();

        // Check if M is valid
        if (M <= 2 || M >= 10) {
            System.out.println("Invalid input for M. M should be greater than 2 and less than 10.");
            return;
        }

        // Declare and input values into the matrix
        int[][] A = new int[M][M];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(A);

        // Rotate the matrix 90 degrees clockwise
        int[][] rotatedMatrix = rotateMatrixClockwise(A);

        // Display the rotated matrix
        System.out.println("Rotated Matrix:");
        displayMatrix(rotatedMatrix);

        // Find the sum of the elements of the four corners of the original matrix
        int sumOfCorners = sumOfFourCorners(A);
        System.out.println("Sum of the elements of the four corners: " + sumOfCorners);
    }

    // Function to rotate the matrix 90 degrees clockwise
    private static int[][] rotateMatrixClockwise(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = matrix[n - 1 - j][i];
            }
        }

        return rotated;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Function to find the sum of the elements of the four corners of the matrix
    private static int sumOfFourCorners(int[][] matrix) {
        int M = matrix.length;
        return matrix[0][0] + matrix[0][M - 1] + matrix[M - 1][0] + matrix[M - 1][M - 1];
    }
}
