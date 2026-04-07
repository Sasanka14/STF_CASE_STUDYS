/*Q2. Find the Smallest number. */
import java.util.Scanner;

public class SmallestNumberInArray {

    // Function to find the smallest number in an array
    public static int findSmallest(int[] array) {
        int smallest = array[0]; // Assume the first element is the smallest initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; // Update the smallest number if the current element is smaller
            }
        }
        return smallest;
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

        // Find the smallest number
        int smallest = findSmallest(array);

        // Output the smallest number
        System.out.println("The smallest number in the array is: " + smallest);

        scanner.close();
    }
}
