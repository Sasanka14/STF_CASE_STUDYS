/*Q1. Print the number of 7’s that are in the 2d array. 
 Example :
          Input - int[][] array = { {4,7,8},{8,8,7} };
          Output - 2 
*/
import java.util.Scanner;

public class ProblemQuestion1{

    // Function to count the number of 7s in the 2D array
    public static int countSevens(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {           // Traverse rows
            for (int j = 0; j < array[i].length; j++) {    // Traverse columns
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    // Function to print the result
    public static void printResult(int count) {
        System.out.println("Number of 7s in the array: " + count);
    }

    // Function to take input for the 2D array
    public static int[][] takeMatrixInput() {
        Scanner scanner = new Scanner(System.in);

        // Input: dimensions of the matrix
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        // Input: matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void main(String[] args) {
        // Take matrix input from user
        int[][] array = takeMatrixInput();

        // Count the number of 7s
        int count = countSevens(array);

        // Print the result
        printResult(count);
    }
}

