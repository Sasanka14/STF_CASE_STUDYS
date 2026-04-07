/* Q. Write a program to accept a sentence which maybe terminated by either '.', '?' or '!' only. Any other character maybe ignored. The words may 
      be separated by more than one blank space are in UPPERCASE.
      Perfrom the following operations:
      A. Accept the sentence and reduce all the extra blank space between two words to a single blank sapce.
      B. Accept a word from the user which is part of the sentence along with its position number and delete the word and display the sentence.*/
//------------------------------------------------------------------SOLUTION--------------------------------------------------------------------
import java.util.Scanner;

public class ModifiedSentenceProcessor {
    public static void main(String[] args) {
        // Input the sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence (terminated by '.', '?', or '!'): ");
        String sentence = scanner.nextLine();

        // A. Reduce extra blank spaces between words to a single blank space
        String processedSentence = reduceExtraSpaces(sentence);

        // Display the processed sentence
        System.out.println("Processed Sentence: " + processedSentence);

        // B. Accept a word and its position number from the user and delete the word
        System.out.print("Enter a word to delete: ");
        String wordToDelete = scanner.next();
        System.out.print("Enter the position number of the word: ");
        int positionNumber = scanner.nextInt();

        // Delete the word at the specified position
        String sentenceAfterDeletion = deleteWordAtPosition(processedSentence, wordToDelete, positionNumber);

        // Display the sentence after deletion
        System.out.println("Sentence after deletion: " + sentenceAfterDeletion);
    }

    // Function to reduce extra blank spaces between words to a single blank space
    private static String reduceExtraSpaces(String sentence) {
        return sentence.replaceAll("\\s+", " ");
    }

    // Function to delete a word at a specified position in the sentence
    private static String deleteWordAtPosition(String sentence, String wordToDelete, int positionNumber) {
        String[] words = sentence.split("\\s+");
        StringBuilder updatedSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != positionNumber - 1 || !words[i].equals(wordToDelete)) {
                updatedSentence.append(words[i]).append(" ");
            }
        }

        return updatedSentence.toString().trim();
    }
}
