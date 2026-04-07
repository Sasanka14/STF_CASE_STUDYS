/*Q. Demonstrates how to find all substrings of a given string. */
import java.util.Scanner;

public class SubstringExample {

    // Function to print all substrings of a given string
    public static void printSubstrings(String str) {
        int length = str.length();
        System.out.println("All substrings of the string:");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Print all substrings
        printSubstrings(str);
        scanner.close();
    }
}
