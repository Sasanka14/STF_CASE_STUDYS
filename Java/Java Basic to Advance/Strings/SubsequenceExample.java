/*Q. Demonstrates how to find all subsequences of a given string. */
import java.util.Scanner;

public class SubsequenceExample {

    // Function to print all subsequences of a string
    public static void printSubsequences(String str) {
        System.out.println("All subsequences of the string:");
        generateSubsequences(str, "", 0);
    }

    // Recursive function to generate subsequences
    private static void generateSubsequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character
        generateSubsequences(str, current + str.charAt(index), index + 1);

        // Exclude the current character
        generateSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Print all subsequences
        printSubsequences(str);
        scanner.close();
    }
}
