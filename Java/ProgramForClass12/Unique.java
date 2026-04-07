/* Q. Design a class Unique, which checks weather a word ends with a vowel.
    Example: APPLE, ARORA etc.... 
The details of the members of the class are given below:
CLASS NAME                                      :  Unique
DATA MEMBERS / INSTANCE VARIABLES
word                                            :  stores a word 
len                                             :  to store the lenght of the word
MEATHOD / MEMBER FUNCTION
Unique()                                        :  default constructor
void aceptword()                                :  to accept thw word in UPPER CASE 
bollean checkUnique()                           :  check and returs 'true' if the ward starts and ends with a Vowel, otherwise 'false'
void display()                                  :  display the word along with an appropriate message 
Spefiy the class Unique, giving details of the constructor,void acceptpword(), boolean checkUnique() and void display(). Define the main()
function to creat an objectand call the functions accordingly to enable the task. */
//-------------------------------------------------------SOLUTION------------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;
public class Unique {
    private String word;
    private int len;
    // Default constructor
    public Unique() {
        word = "";
        len = 0;
    }
    // Method to accept the word in UPPER CASE
    public void acceptWord() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a word in UPPER CASE: ");
            word = scanner.next();
            len = word.length();
            
            if (word.matches("[A-Z]+")) {
                break;                                               // Input is in uppercase; exit the loop
            } else {
                System.out.println("Please enter the word in UPPER CASE.");
            }
        }
    }

    // Method to check and return 'true' if the word starts and ends with a vowel, otherwise 'false'
    public boolean checkUnique() {
        if (len <= 2) {
            return false;                                          // A word must have at least two characters to check vowel at the end.
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(len - 1);

        // Check if the first character is a vowel (A, E, I, O, U) and the last character is the same vowel
        return "AEIOU".contains(String.valueOf(firstChar)) && "AEIOU".contains(String.valueOf(lastChar)); 
    }

    // Method to display the word along with an appropriate message
    public void display() {
        if (checkUnique()) {
            System.out.println(word + " starts and ends with the  vowel.");
        } else {
            System.out.println(word + " does not start and end with the same vowel or is too short.");
        }
    }

    public static void main(String[] args)throws IOException {
        Unique uniqueChecker = new Unique();
        uniqueChecker.acceptWord();
        uniqueChecker.display();
    }
}
