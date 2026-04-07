/* Q. WAP which accepts a word and arrange in an alphabetical oder using Selection sorting technique  */
//-------------------------------------------------------------------------------------SOLUTION------------------------------------------------------------------------------------
import java.util.Scanner;

public class AlphabeticalOrderSelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to a character array
        char[] charArray = word.toCharArray();

        // Apply selection sort to arrange the characters in alphabetical order
        for (int i = 0; i < charArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[j] < charArray[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            char temp = charArray[minIndex];
            charArray[minIndex] = charArray[i];
            charArray[i] = temp;
        }

        // Convert the sorted array back to a string
        String sortedWord = new String(charArray);

        // Display the word in alphabetical order
        System.out.println("Word in alphabetical order: " + sortedWord);
    }
}
