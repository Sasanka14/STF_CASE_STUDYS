/*Q2. Print out the sum of the numbers in the second row of the “nums” array 
       Example :
       Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
       Output - 18
*/
import java.util.Scanner;

public class ProblemQuestion2 {

    // Function to calculate the sum of the second row in the 2D array
    public static int sumSecondRow(int[][] nums) {
        int sum = 0;
        for (int j = 0; j < nums[1].length; j++) {  // Traverse the second row (index 1)
            sum += nums[1][j];                      // Add each element to sum
        }
        return sum;
    }

    // Function to print the result
    public static void printResult(int sum) {
        System.out.println("Sum of the numbers in the second row: " + sum);
    }

    // Function to display the matrix
    public static void printMatrix(int[][] nums) {
        System.out.println("Your input matrix is:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    // Function to take input for the 2D array
    public static int[][] takeMatrixInput() {
        Scanner scanner = new Scanner(System.in);

        // Input: dimensions of the matrix
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] nums = new int[n][m];

        // Input: matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        // Take matrix input from the user
        int[][] nums = takeMatrixInput();

        // Print the input matrix
        printMatrix(nums);

        // Calculate the sum of the second row
        int sum = sumSecondRow(nums);

        // Print the result
        printResult(sum);
    }
}
