/* Q. Write a program to accept a sentence which maybe terminated  by either '.' , '?' or '!' only. The words are to be separated by a single blank 
      space and are in UPPERCASE.
      Perfrom the following tasks:
      A. Check for the validity of the sentence only for terminating character.
      B. Arrange the words in ascending oder of their lenght. If two or more words have the same lenght , then sort them alphabetically.
      c. Display the original sentence along with the arranged sentence.*/
//--------------------------------------------------------------------SOLUTION------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Scanner;

public class SentenceManipulator {
    public static void main(String[] args) {
        // Input the sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence (terminated by '.', '?', or '!'): ");
        String sentence = scanner.nextLine();

        // A. Check for the validity of the sentence (only for terminating characters)
        if (!isValidSentence(sentence)) {
            System.out.println("Error: Invalid sentence.");
            return;
        }

        // B. Arrange the words in ascending order of their length and alphabetically
        String[] words = sentence.split("\\s+");
        String[] arrangedWords = arrangeWords(words);

        // C. Display the original sentence and the arranged sentence
        displaySentences(sentence, arrangedWords);
    }

    // Function to check for the validity of the sentence (only for terminating characters)
    private static boolean isValidSentence(String sentence) {
        return sentence.matches("[A-Z ]+[.!?]");
    }

    // Function to arrange the words in ascending order of their length and alphabetically
    private static String[] arrangeWords(String[] words) {
        Arrays.sort(words, (word1, word2) -> {
            if (word1.length() != word2.length()) {
                return word1.length() - word2.length();
            } else {
                return word1.compareTo(word2);
            }
        });

        return words;
    }

    // Function to display the original sentence and the arranged sentence
    private static void displaySentences(String original, String[] arranged) {
        System.out.println("Original Sentence: " + original);
        System.out.println("Arranged Sentence: " + String.join(" ", arranged));
    }
}
