/*Q2.There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is 
possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],  
 ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).  
    For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].
  Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is 
  not in nums.You must write an algorithm with O(log n) runtime complexity */
  import java.util.Scanner;

  public class ProblemQuestion2 {
  
      // Function to search target in rotated sorted array
      public static int search(int[] nums, int target) {
          int left = 0, right = nums.length - 1;
  
          while (left <= right) {
              int mid = left + (right - left) / 2;
  
              if (nums[mid] == target) {
                  return mid;
              }
  
              // Check if left part is sorted
              if (nums[left] <= nums[mid]) {
                  // Target is in the sorted left part
                  if (nums[left] <= target && target < nums[mid]) {
                      right = mid - 1;
                  } else {
                      left = mid + 1;
                  }
              }
              // Otherwise, the right part must be sorted
              else {
                  // Target is in the sorted right part
                  if (nums[mid] < target && target <= nums[right]) {
                      left = mid + 1;
                  } else {
                      right = mid - 1;
                  }
              }
          }
  
          return -1; // Target is not in array
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
  
          // Input: target value
          System.out.print("Enter the target value: ");
          int target = scanner.nextInt();
  
          // Search for the target and print the result
          int result = search(nums, target);
          if (result != -1) {
              System.out.println("Target found at index: " + result);
          } else {
              System.out.println("Target not found in the array");
          }
  
          scanner.close();
      }
  }
  