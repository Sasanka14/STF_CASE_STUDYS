/*Q5.Performing Counting Sorting Techniques */
import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum and minimum values in the array
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
            if (num < minVal) {
                minVal = num;
            }
        }

        // Compute the range of values
        int range = maxVal - minVal + 1;

        // Create count array and output array
        int[] count = new int[range];
        int[] output = new int[n];

        // Initialize count array with all zeros
        for (int i = 0; i < n; i++) {
            count[arr[i] - minVal]++;
        }

        // Modify the count array to store the cumulative count of elements
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array using the count array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - minVal] - 1] = arr[i];
            count[arr[i] - minVal]--;
        }

        // Copy the sorted elements from the output array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform counting sort
        countingSort(arr);

        // Output: sorted array
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
