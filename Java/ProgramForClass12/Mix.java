/* Q. A class Mix has been defined to mix two words, character by character, in the following manner:
 The first character of the first word is followed by the first character of the second word and so on. If the words are different length,the remaiining 
 characters of the longer word are put at the end.
        Example :
                  If the first word is "JUMP" and the second word is "STROLL", then the required word will be "JSUTMRPOLL"
Some of the members of the class are given below:
Class Name                                      : Mix
Data Member / Instance Variable 
wrd                                             : to store a word
len                                             : to store the length of the word
Member Function / Methods 
Mix()                                           : default constructor to initialise the data members with legal initial values
void feedword()                                 : to accept the word in UPPER  case
void mix_word(Mix P , Mix Q)                    : mixes the words of Object P and Q as stated above and stores the resultant word in the current object
void display                                    : display the word
Specify the Mix giving the details of the constructor(), void freeword () , void mix_word(Mix , Mix) and void display(). Define the main() function to create objects
and call the functions accordingly to enable the task. */
//------------------------------------------------------------------SOLUTION----------------------------------------------------------------------------------------
import java.util.Scanner;

public class Mix {
    private String wrd;
    private int len;

    // Default constructor to initialize data members with legal initial values
    public Mix() {
        wrd = "";
        len = 0;
    }

    // Function to accept the word in UPPER case
    public void feedWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word in UPPER case: ");
        wrd = scanner.next();
        len = wrd.length();
    }

    // Function to mix words of Object P and Q as stated and store the resultant word in the current object
    public void mixWord(Mix P, Mix Q) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(P.len, Q.len);

        for (int i = 0; i < minLength; i++) {
            result.append(P.wrd.charAt(i)).append(Q.wrd.charAt(i));
        }

        if (P.len > Q.len) {
            result.append(P.wrd.substring(minLength));
        } else if (Q.len > P.len) {
            result.append(Q.wrd.substring(minLength));
        }

        wrd = result.toString();
        len = wrd.length();
    }

    // Function to display the word
    public void display() {
        System.out.println("Mixed Word: " + wrd);
    }

    public static void main(String[] args) {
        // Create objects of the Mix class
        Mix obj1 = new Mix();
        Mix obj2 = new Mix();

        // Call feedWord() to accept words for both objects
        obj1.feedWord();
        obj2.feedWord();

        // Create a new object to store the mixed word
        Mix resultObj = new Mix();

        // Call mixWord() to mix words of obj1 and obj2 and store the result in resultObj
        resultObj.mixWord(obj1, obj2);

        // Call display() to display the mixed word
        resultObj.display();
    }
}