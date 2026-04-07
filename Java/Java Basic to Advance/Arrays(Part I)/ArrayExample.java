/*Demonstrate how to take input, output and update   */
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array of integers
        int[] intArray = new int[size];
        
        // Input values into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        // Output the values of the array
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        // Update an element in the array
        System.out.print("Enter the index of the element you want to update: ");
        int index = scanner.nextInt();
        
        // Check if the index is valid
        if (index >= 0 && index < size) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            intArray[index] = newValue;
        } else {
            System.out.println("Invalid index.");
        }
        
        // Output the updated values of the array
        System.out.println("Updated array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
