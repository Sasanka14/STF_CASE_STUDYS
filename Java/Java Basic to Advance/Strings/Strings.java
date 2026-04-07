/*Q. An example of a String.  */
import java.util.*;

public class Strings {
    // Method to print each letter of a string on a single line, separated by space
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); // For a new line after printing all characters
    }

    public static void main(String[] args) {
        // Creating a character array
        char arr[] = {'a', 'b', 'c', 'd'};
        
        // Creating a string directly
        String str1 = "abcd";
        
        // Creating a string using the new keyword
        String str2 = new String("xyz");

        // Strings are "IMMUTABLE"
        Scanner sc = new Scanner(System.in);

        // Taking string input using Scanner
        System.out.print("Enter  (single word): ");
        String name = sc.next(); // Reads a single word (until the first space)
        System.out.println("For Single word : " + name);

        sc.nextLine(); // Consuming the leftover newline
        System.out.print("Enter (full words): ");
        name = sc.nextLine(); // Reads the full line (including spaces)
        System.out.println("For Multiple words : " + name);

        // Example string and its length
        String fullname = "Tony Stark";
        System.out.println("Length of fullname: " + fullname.length());

        // Concatenation example
        String firstname = "Sasanka";
        String middlename = "Sekhar";
        String lastname = "Kundu";

        String fullname1 = firstname + " " + middlename + " " + lastname;
        System.out.println("Character at index 9: " + fullname1.charAt(9));

        // Printing each character of the fullname1
        printLetters(fullname1);

        // Printing the arrays and strings
        System.out.println("Character array: " + Arrays.toString(arr));
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        sc.close(); // Closing the Scanner object to avoid resource leaks
    }
}
