/*Q5.Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and 
nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets. */
import java.util.*; // Importing all classes from the java.util package

public class ProblemQuestion5 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // Using ArrayList from java.util package
        if (nums == null || nums.length < 3) return result;

        Arrays.sort(nums);  // Using Arrays class from java.util package to sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // Using Arrays class from java.util package

                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Move the left pointer to the right
                } else {
                    right--;  // Move the right pointer to the left
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Using Scanner from java.util package

        // Input: number of elements in the nums array
        System.out.print("Enter the number of elements in the nums array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Input: elements of the nums array
        System.out.println("Enter the elements of the nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find and print all unique triplets that sum to zero
        List<List<Integer>> triplets = threeSum(nums);
        System.out.println("Unique triplets that sum to zero: " + triplets);

        scanner.close(); // Closing the Scanner
    }
}

