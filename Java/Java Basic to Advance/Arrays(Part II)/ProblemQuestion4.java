/*Q4. Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can 
trap after raining. */
import java.util.Scanner;

public class ProblemQuestion4 {

    // Function to compute the trapped water using the two-pointer approach
    public static int trapRainwater(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int trappedWater = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    trappedWater += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    trappedWater += right_max - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the height array
        System.out.print("Enter the number of elements in the height array: ");
        int n = scanner.nextInt();

        int[] height = new int[n];

        // Input: elements of the height array
        System.out.println("Enter the elements of the height array: ");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Calculate and print the total trapped rainwater
        System.out.println("Total trapped rainwater: " + trapRainwater(height));

        scanner.close();
    }
}
