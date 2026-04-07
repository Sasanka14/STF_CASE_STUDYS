/* Q. Design a class BinSearch to search for a particular value in an array.
 Some of the members of the class are given below:
 Class Name                                       : BinSearch
 Data Members / Instance Variables
 arr[]                                            : to store integer elements
 n                                                : integer to store the size of the array
 Member Functions / Methods
 BinSearch(int nn)                                : parametersized constructor to initialise n = nn
 void fillarray()                                 : to enter elements in the array \
 void sort()                                      : sorts the array elements in ascending order using any standard sorting technique
 int bin_search(int l, int u, int v)              : seaches for the value 'v' using binary search and recursive technique and returns its location if found otherwise return -1
 Define the class BinSearch giving details of the constructor(), void fillarray(), void sort() and int bin_search(int , int , int). Define the main() function to create an object 
 and call the functions accordingly to enable the task.*/
 //-------------------------------------------------------------------------SOLUTION-----------------------------------------------------------------------------------
 import java.util.Scanner;
import java.util.Arrays;

public class BinSearch {
    private int[] arr;
    private int n;

    // Parameterized constructor to initialize n
    public BinSearch(int nn) {
        n = nn;
        arr = new int[n];
    }

    // Function to fill array elements
    public void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // Function to sort array elements in ascending order using Arrays.sort()
    public void sort() {
        Arrays.sort(arr);
    }

    // Recursive binary search function
    public int binSearch(int l, int u, int v) {
        if (u >= l) {
            int mid = l + (u - l) / 2;

            if (arr[mid] == v) {
                return mid; // Element found
            }

            if (arr[mid] > v) {
                return binSearch(l, mid - 1, v); // Search in the left subarray
            }

            return binSearch(mid + 1, u, v); // Search in the right subarray
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an object of the BinSearch class
        BinSearch obj = new BinSearch(size);

        // Call fillArray() to input array elements
        obj.fillArray();

        // Call sort() to sort the array elements
        obj.sort();

        // Input the value to be searched
        System.out.print("Enter the value to be searched: ");
        int searchValue = scanner.nextInt();

        // Call binSearch() to search for the value in the array
        int result = obj.binSearch(0, size - 1, searchValue);

        // Display the search result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
