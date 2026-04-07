/*Q4.Performing Java's In-built Sorting System. */
import java.util.Arrays;          // Importing Arrays class for built-in sorting
import java.util.Collections;     // Importing Collections class for reversing the list
import java.util.Scanner;         // Importing Scanner class for taking user input
import java.util.List;            // Importing List interface
import java.util.ArrayList;       // Importing ArrayList class which implements List

public class BuiltInSort {
    
    // Method to perform built-in sort
    public static void builtInSort(int[] arr) {
        // Using Java's built-in sort method to sort the array
        Arrays.sort(arr);
    }

    // Method to reverse the array and print
    public static void printReverse(int[] arr) {
        // Convert array to List for easy reversal
        List<Integer> list = new ArrayList<>();
        
        // Iterate over each element in the array and add it to the list
        for (int i : arr) {
            list.add(i);  // Add each element of the array to the list
        }

        // Reverse the order of elements in the list
        Collections.reverse(list);

        // Print the reversed list
        System.out.println("Reversed sorted array: ");
        for (int i : list) {
            System.out.print(i + " ");  // Print each element of the reversed list
        }
        System.out.println();  // Print a new line after printing all elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();  // Read the number of elements

        int[] arr = new int[n];  // Create an array of the specified size

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Read each element and store it in the array
        }

        // Perform built-in sort
        builtInSort(arr);

        // Output: sorted array
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");  // Print each element of the sorted array
        }
        System.out.println();  // Print a new line after printing all elements

        // Print reversed sorted array
        printReverse(arr);

        scanner.close();  // Close the Scanner object
    }
}
