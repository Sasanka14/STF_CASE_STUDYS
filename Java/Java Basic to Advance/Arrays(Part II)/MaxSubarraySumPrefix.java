/*Performing Max Subarray Sum.  (Prefix Sum)  */
import java.util.Scanner;

public class MaxSubarraySumPrefix {

    // Function to find the maximum subarray sum using prefix array
    public static int maxSubarraySum(int[] array) {
        int n = array.length;
        int maxSum = Integer.MIN_VALUE;
        
        // Create and fill the prefix array
        int[] prefix = new int[n];
        prefix[0] = array[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        
        // Find the maximum subarray sum
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
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
