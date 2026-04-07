/*Performing Max Subarray Sum.  (Kadane's Algorithm)  */
import java.util.Scanner;

public class MaxSubarraySumKadanes {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int maxSubarraySum(int[] array) {
        int maxCurrent = array[0];
        int maxGlobal = array[0];

        for (int i = 1; i < array.length; i++) {
            maxCurrent = Math.max(array[i], maxCurrent + array[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
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

        // Find the maximum subarray sum
        int maxSum = maxSubarraySum(array);

        // Output the result
        System.out.println("Maximum subarray sum is: " + maxSum);

        scanner.close();
    }
}
