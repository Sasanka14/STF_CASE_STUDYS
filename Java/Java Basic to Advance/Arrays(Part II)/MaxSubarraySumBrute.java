/*Q1. Performing Max Subarray Sum. (Brute Force) */
import java.util.Scanner;

public class MaxSubarraySumBrute {

    // Function to find the maximum subarray sum using brute force
    public static int maxSubarraySum(int[] array) {
        int n = array.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += array[k];
                }
                System.out.println("Current subarray sum from index " + i + " to " + j + " is: " + currentSum);
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
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
