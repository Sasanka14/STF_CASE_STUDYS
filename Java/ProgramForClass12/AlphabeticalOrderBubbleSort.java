/* Q. WAP which accepts a word and arrange in an alphabetical oder using Bubble sorting technique  */
//-------------------------------------------------------------------------------------SOLUTION------------------------------------------------------------------------------------
import java.util.Scanner;

public class AlphabeticalOrderBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to a character array
        char[] charArray = word.toCharArray();

        // Apply bubble sort to arrange the characters in alphabetical order
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap the adjacent elements if they are in the wrong order
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert the sorted array back to a string
        String sortedWord = new String(charArray);

        // Display the word in alphabetical order
        System.out.println("Word in alphabetical order: " + sortedWord);
    }
}
