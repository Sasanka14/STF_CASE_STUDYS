/* Q. Write a program to declare a single dimenstion array a[] and a sqare matrix b[][] of size N, Where N > 2 and N < 10. Allow the user to 
      input positive integers into single dimenstion array a[]. 
      Perfrom the following operations on the matrix:
      A. Sort the elements of the matrix in ascending order using any sorting techinique and display the sorted elements.
      B. Fill Square matrix b[][] in the following formate:
         If the array a[] ={5,2,8,1} then , after sorting a[] = {1,2,5,8}
         Then the matrix b[][] would fills as below:
          1   2   5   8
          1   2   5   1
          1   2   1   2
          1   1   2   5
      C. Display the filled matrix in above formate .*/
//------------------------------------------------------------------------SOLUTION---------------------------------------------------------------
import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations1 {
    public static void main(String[] args) {
        // Input the size of the square matrix
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (N, where 2 < N < 10): ");
        int N = scanner.nextInt();

        // Check if N is valid
        if (N <= 2 || N >= 10) { 
            System.out.println("Invalid input for N. N should be greater than 2 and less than 10.");
            return;
        }

        // Declare and input values into the array
        int[] a = new int[N];
        System.out.println("Enter " + N + " positive integers for array a[]:");
        for (int i = 0; i < N; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // A. Sort the elements of the array in ascending order
        Arrays.sort(a);
        System.out.println("A. Sorted elements of array a[]: " + Arrays.toString(a));

        // B. Fill square matrix b[][] in the specified format
        int[][] b = fillMatrix(a);

        // C. Display the filled matrix in the specified format
        System.out.println("C. Filled matrix b[][]:");
        displayMatrix(b);
    }

    // Function to fill the square matrix in the specified format
    private static int[][] fillMatrix(int[] a) {
        int N = a.length;
        int[][] b = new int[N][N];

        // Fill the first row of matrix b with sorted array a
        System.arraycopy(a, 0, b[0], 0, N);

        // Fill the remaining rows of matrix b in the specified format
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = a[j];
            }
        }

        return b;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
