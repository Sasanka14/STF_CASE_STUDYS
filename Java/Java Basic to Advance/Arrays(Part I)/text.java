import java.util.Scanner;

public class ArrayPairs {

    // Function to print all pairs in the array
    public static void printPairs(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + array[i] + ", " + array[j] + ")");
            }
        }
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

        // Print all pairs in the array
        System.out.println("All pairs in the array are: ");
        printPairs(array);

        scanner.close();
    }
}
