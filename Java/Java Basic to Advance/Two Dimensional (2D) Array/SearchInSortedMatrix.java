/*You are given a n x m matrix where each row and each column is sorted in ascending order. Write a program to search for a given key in this matrix efficiently. If the key exists, return the position (row, column) of the key; otherwise, return (-1, -1) to indicate that the key is not found. */
import java.util.Scanner;

public class SearchInSortedMatrix{

    // Function to perform the staircase search
    public static boolean staircaseSearch(int[][] matrix, int n, int m, int key) {
        int row = 0;         // Start at the first row
        int col = m - 1;     // Start at the last column

        while (row < n && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key " + key + " found at position: (" + row + ", " + col + ")");
                return true;
            }
            else if (matrix[row][col] > key) {
                col--;  // Move left
            } 
            else {
                row++;  // Move down
            }
        }

        System.out.println("Key " + key + " not found in the matrix.");
        return false;
    }

    // Function to take input for the matrix
    public static int[][] takeMatrixInput(int n, int m) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][m];

        System.out.println("Enter the elements of the matrix (sorted row-wise and column-wise):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: dimensions of the matrix
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        // Input: the matrix elements
        int[][] matrix = takeMatrixInput(n, m);

        // Display the matrix
        displayMatrix(matrix);

        // Input: the key to search for
        System.out.println("Enter the key to search: ");
        int key = scanner.nextInt();

        // Perform the search
        staircaseSearch(matrix, n, m, key);

        scanner.close();
    }
}
