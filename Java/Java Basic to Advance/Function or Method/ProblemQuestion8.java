/*Q8. Write a Java Program to check if a number is a palindrome in JAVA ? (121 is a PALINDROME, 321 is not.)
      A number is called a palindrome if the number is equal to reverse of a number eg., 121 is a palindrome because the reverse of 121
      is 121 itself. On the Other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321. 
*/
import java.util.Scanner;

public class ProblemQuestion8 {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false; // If characters do not match, it is not a palindrome
            }
        }
        return true; // If all characters match, it is a palindrome
    }

    // Method to get user input and check if the input is a palindrome
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number or a word
        System.out.print("Enter a number or a word: ");
        String userInput = scanner.nextLine();

        // Check if the input is a palindrome and print the result
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

        scanner.close(); // Close the scanner
    }
}
