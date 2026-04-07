/*Q4.Performing pairs in an Array. */
import java.util.Scanner;

public class ArrayPairs {

    // Function to print all pairs in the array and return the count
    public static int printPairs(int[] array) {
        int n = array.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + array[i] + ", " + array[j] + ") ");
                count++;
            }
            System.out.println();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print all pairs in the array and get the total count
        System.out.println("All pairs in the array are: ");
        int totalPairs = printPairs(array);

        // Print the total number of pairs
        System.out.println("Total number of pairs: " + totalPairs);

        scanner.close();
    }
}
