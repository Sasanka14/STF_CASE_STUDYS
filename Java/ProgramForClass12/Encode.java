/* Q. A class Encode has been defined to replace only the vowels in a word by the next 
corresponding vowel and form a new word. 
i.e. A → E, E → I, I → O, O → U, U → A and
 a → e, e → i, i → o, o → u, and u → a
Example: Input: Institution
 Output: Onstotatoun 
Some of the members of the class are given below: 
Class name : Encode
Data members/instance variables:
word : to store a word
length : integer to store the length of the word
new_word : to store the encoded word 
Methods / Member functions:
Encode( ) : default constructor to initialize data members 
with legal initial values
void acceptWord( ) : to accept a word 
void nextVowel( ) : to replace only the vowels from the word stored 
in ‘word’ by the next corresponding vowel and 
to assign it to ‘newword’, with the remaining 
alphabets unchanged
void display( ) : to display the original word along with the 
encrypted word
Specify the class Encode giving details of the constructor( ), void acceptWord( ), 
void nextVowel( ) and void display( ). Define a main ( ) function to create an object and 
call the functions accordingly to enable the task.*/ 
// -----------------------------------------------------------------------------SOLUTION --------------------------------------------------------------------------------------
import java.util.Scanner;

public class Encode {
    private String word;
    private int length;
    private String newWord;

    public Encode() {
        word = "";
        length = 0;
        newWord = "";
    }

    public void acceptWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        length = word.length();
    }

    public void nextVowel() {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        StringBuilder encodedWord = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char currentChar = word.charAt(i);
            char nextVowel = currentChar;

            // Check if the character is a vowel
            if (Character.isLetter(currentChar) && "AEIOUaeiou".indexOf(currentChar) != -1) {
                int index = new String(vowels).indexOf(currentChar);
                nextVowel = vowels[(index + 1) % vowels.length];
            }

            encodedWord.append(nextVowel);
        }

        newWord = encodedWord.toString();
    }

    public void display() {
        System.out.println("Original Word: " + word);
        System.out.println("Encoded Word: " + newWord);
    }

    public static void main(String[] args) {
        Encode encodeObj = new Encode();
        encodeObj.acceptWord();
        encodeObj.nextVowel();
        encodeObj.display();
    }
}
