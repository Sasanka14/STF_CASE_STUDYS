/*Q1. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is 
distinct. */
import java.util.HashSet;
import java.util.Scanner;

public class ProblemQuestion1 {

    // Function to check if any value appears at least twice in the array
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Check if any value appears at least twice and print the result
        System.out.println("Contains duplicate: " + containsDuplicate(nums));

        scanner.close();
    }
}
