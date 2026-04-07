/* Q. Write a program to accept a sentence which may be terminated by either '.' , '?' or '!' only. The words are to be separated by a single blank
      space and are in UPPERCASE.
      Perfrom the following tasks:
      A. Check for the validity of the  accepted sentence.
      B. Convert the non - palindrome words of the sentence into palindrome words by concatenating the words by its reverse(Excluding the last Character).*/
//------------------------------------------------------------------------SOLUTION---------------------------------------------------------------------
import java.util.Scanner;

public class SentenceProcessor {
    public static void main(String[] args) {
        // Input the sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence (terminated by '.', '?', or '!'): ");
        String sentence = scanner.nextLine();

        // A. Check for the validity of the accepted sentence
        if (!isValidSentence(sentence)) {
            System.out.println("Error: Invalid sentence.");
            return;
        }

        // B. Convert non-palindrome words into palindrome words
        String[] words = sentence.split("\\s+");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            if (!isPalindrome(word)) {
                // Convert non-palindrome words into palindrome
                modifiedSentence.append(makePalindrome(word)).append(" ");
            } else {
                // Keep palindrome words as they are
                modifiedSentence.append(word).append(" ");
            }
        }

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence.toString().trim());
    }

    // Function to check for the validity of the sentence
    private static boolean isValidSentence(String sentence) {
        return sentence.matches("[A-Z ]+[.!?]");
    }

    // Function to check if a word is a palindrome
    private static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    // Function to make a word palindrome by concatenating it with its reverse (excluding the last character)
    private static String makePalindrome(String word) {
        String reversedPart = new StringBuilder(word).reverse().substring(1);
        return word + reversedPart;
    }
}
