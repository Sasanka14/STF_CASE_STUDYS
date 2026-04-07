/* Q. A class Plain has been defined to check weather a positive number is a Palindrome number or not. 
      The number 'N' is a palindrome if it is equal to the reverse of its digits. 
      For example, the number '121' is a palindrome, but the number '123' is not a palindrome.*/
//---------------------------------------------------------------------SOLUTION---------------------------------------------------------------------
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Input a positive number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        // Create an instance of the Plain class
        Plain plainObj = new Plain();

        // Check and display whether the number is a palindrome or not
        if (plainObj.isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

class Plain {
    // Function to check if a number is a palindrome
    public boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
