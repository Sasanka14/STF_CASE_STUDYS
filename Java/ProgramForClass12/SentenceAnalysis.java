/* Q. Write a program to accept a sentence which maybe terminated by either '.' or '?' only. The words are to be separated by single blank space.
      Print an error message if the sentence is not terminated by either '.' or '?'. You can assume that no word in a sentence exceeds 15 characters
      so that you get a proper formated output.
      Perfrom the following:
      A. Convert the first letter of each word to upper case.
      B. Find the number of vowels and consonent in each word and display them with proper heading along with the words.*/
//------------------------------------------------------------------SOLUTION----------------------------------------------------------------------------------------
import java.util.Scanner;

public class SentenceAnalysis {
    public static void main(String[] args) {
        // Input the sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence (terminated by '.' or '?'): ");
        String sentence = scanner.nextLine();

        // Check if the sentence is terminated by '.' or '?'
        if (!(sentence.endsWith(".") || sentence.endsWith("?"))) {
            System.out.println("Error: Sentence must be terminated by '.' or '?'.");
            return;
        }

        // Process and analyze the sentence
        processSentence(sentence);
    }

    // Function to process and analyze the sentence
    private static void processSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // A. Convert the first letter of each word to upper case
        System.out.println("A. Sentence with first letter of each word in upper case:");
        for (String word : words) {
            System.out.print(capitalizeFirstLetter(word) + " ");
        }
        System.out.println();

        // B. Find the number of vowels and consonants in each word
        System.out.println("B. Analysis of each word:");
        for (String word : words) {
            analyzeWord(word);
        }
    }

    // Function to capitalize the first letter of a word
    private static String capitalizeFirstLetter(String word) {
        if (word.length() > 0) {
            return Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }
        return word;
    }

    // Function to analyze a word and find the number of vowels and consonants
    private static void analyzeWord(String word) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Word: " + word);
        System.out.println("   Vowels: " + vowelCount);
        System.out.println("   Consonants: " + consonantCount);
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
