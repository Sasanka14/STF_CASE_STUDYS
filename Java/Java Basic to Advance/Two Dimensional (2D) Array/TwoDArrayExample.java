/*Demonstrating How 2D Arrays Works. And Using Search Function a that number in the cell or key. */
import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        int[][] array = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int searchValue = scanner.nextInt();

        searchIn2DArray(array, searchValue);

        scanner.close();
    }

    // Function to search for a value in the 2D array
    public static void searchIn2DArray(int[][] array, int searchValue) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchValue) {
                    System.out.println("Value " + searchValue + " found at position (" + i + ", " + j + ").");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value " + searchValue + " not found in the array.");
        }
    }
}