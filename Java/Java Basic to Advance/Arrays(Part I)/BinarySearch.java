/*Performing Binary search.*/
import java.util.Scanner;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(String[] array, String key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid].compareTo(key) == 0) {
                return mid;
            }

            // If the key is greater, ignore the left half
            if (array[mid].compareTo(key) < 0) {
                left = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Key not present in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined sorted array of strings with a larger dataset
        String[] array = {
            "apple", "apricot", "avocado", "banana", "blackberry", "blueberry", "boysenberry",
            "cantaloupe", "cherry", "clementine", "coconut", "cranberry", "date", "dragonfruit",
            "durian", "elderberry", "fig", "gooseberry", "grape", "grapefruit", "guava", "honeydew",
            "jackfruit", "kiwi", "kumquat", "lemon", "lime", "lychee", "mango", "mulberry", "nectarine",
            "orange", "papaya", "passionfruit", "peach", "pear", "persimmon", "pineapple", "plum",
            "pomegranate", "quince", "raspberry", "redcurrant", "starfruit", "strawberry", "tangerine",
            "ugli fruit", "watermelon"
        };

        // Input: the element to search for
        System.out.print("Enter the element to search for: ");
        String key = scanner.nextLine();

        // Perform binary search
        int result = binarySearch(array, key);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
