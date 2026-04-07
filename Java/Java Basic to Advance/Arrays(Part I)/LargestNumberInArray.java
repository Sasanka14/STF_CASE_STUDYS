/*Q1. Find the largest number. */
import java.util.Scanner;

public class LargestNumberInArray {

    // Function to find the largest number in an array
    public static int findLargest(int[] array) {
        int largest = array[0]; // Assume the first element is the largest initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update the largest number if the current element is greater
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: elements of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest number
        int largest = findLargest(array);

        // Output the largest number
        System.out.println("The largest number in the array is: " + largest);

        scanner.close();
    }
}
