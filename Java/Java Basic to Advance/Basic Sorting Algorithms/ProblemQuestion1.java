/*Q6. Use the following sorting algorithms to sort an array in DESCENDING order :
      a.Bubble Sort
      b.Selection Sort
      c.Insertion Sort
      d.Counting Sort
      e.Inbuilt Sort 
      
 You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ProblemQuestion1 {

    // Bubble Sort in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    // Selection Sort in descending order
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort in descending order
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Counting Sort in descending order (limited to non-negative integers)
    public static void countingSortDescending(int[] arr) {
        int largest = Integer.MIN_VALUE;

        // Find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create count array
        int[] count = new int[largest + 1];

        // Store the count of each element in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Modify the original array to store the sorted elements in descending order
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Main method to demonstrate sorting based on user's choice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input: elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask user which sorting technique they want to use
        System.out.println("Choose a sorting technique:");
        System.out.println("a. Bubble Sort");
        System.out.println("b. Selection Sort");
        System.out.println("c. Insertion Sort");
        System.out.println("d. Counting Sort");
        System.out.println("If you choose any input other than (a, b, c, d), the program will use the in-built sorting technique.");

        System.out.print("Enter your choice (a, b, c, d): ");
        String choice = scanner.next().toLowerCase();

        // Perform sorting based on user's choice
        switch (choice) {
            case "a":
                bubbleSortDescending(arr);
                System.out.println("Sorted array using Bubble Sort in descending order: " + Arrays.toString(arr));
                break;
            case "b":
                selectionSortDescending(arr);
                System.out.println("Sorted array using Selection Sort in descending order: " + Arrays.toString(arr));
                break;
            case "c":
                insertionSortDescending(arr);
                System.out.println("Sorted array using Insertion Sort in descending order: " + Arrays.toString(arr));
                break;
            case "d":
                countingSortDescending(arr);
                System.out.println("Sorted array using Counting Sort in descending order: " + Arrays.toString(arr));
                break;
            default:
               // Default to Java's built-in sorting in descending order
               Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
               Arrays.sort(arrInteger, Collections.reverseOrder());
               int[] sortedArr = Arrays.stream(arrInteger).mapToInt(Integer::intValue).toArray();
               System.out.println("Sorted array using Java's built-in sort in descending order: " + Arrays.toString(sortedArr));
               break;
        }


        scanner.close();
    }
}
