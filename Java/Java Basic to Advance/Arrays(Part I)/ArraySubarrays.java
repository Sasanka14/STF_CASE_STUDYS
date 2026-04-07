/*Q5. Performing Subarrays. */
import java.util.Scanner;

public class ArraySubarrays {

    // Function to print all subarrays of the array and count the total subarrays
    public static void printSubarrays(int[] array) {
        int n = array.length;
        int totalSubarrays = 0;
        
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
                totalSubarrays++;
            }
            System.out.println();
        }
        
        // Print the total number of subarrays
        System.out.println("Total number of subarrays: " + totalSubarrays);
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

        // Print all subarrays of the array
        System.out.println("All subarrays of the array are: ");
        printSubarrays(array);

        scanner.close();
    }
}
