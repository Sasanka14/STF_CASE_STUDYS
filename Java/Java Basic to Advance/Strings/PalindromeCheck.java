/*Q. Write a Java program to check if a given string is a palindrome or not. Take user input and create a separate function to perform the palindrome check. */
import java.util.Scanner;

public class PalindromeCheck {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Checking if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        sc.close();
    }
}
