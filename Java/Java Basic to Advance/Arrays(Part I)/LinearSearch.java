/*Performing Linear Search. */
import java.util.Scanner;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Return the index of the found element
            }
        }
        return -1;  // Return -1 if the element is not found
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

        // Input: the element to search for
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, key);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
