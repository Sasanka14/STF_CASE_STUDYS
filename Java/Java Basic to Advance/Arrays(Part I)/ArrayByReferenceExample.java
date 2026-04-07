/*Demonstrate array is call by reference. */
import java.util.Arrays;

public class ArrayByReferenceExample {

    // Method to modify the array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Double each element in the array
        }
    }

    public static void main(String[] args) {
        // Initialize an array
        int[] myArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(myArray));

        // Pass the array to the method that modifies it
        modifyArray(myArray);

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(myArray));
    }
}
