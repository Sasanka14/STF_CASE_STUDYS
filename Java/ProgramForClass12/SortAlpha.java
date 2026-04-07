/* Q. A class SortAlpha has been defined to sort the words in the sentence in alphabetical order.
    Example : Input  : THE SKY IS BLUE
              Output : BLUE IS SKY THE 
Some of the members of the class are given below:
CLASS NMAE                                      :   SortAlpha
DATA MEMBERS / INSTANCE VARIABLES
sent                                            :   to store a sentence 
n                                               :   integer to store the number of words in a sentence
METHODS / MEMBER FUNCTION  
SortAlpha()                                     :   default constructor to initialise data members witha a legal initial valus
void acceptSent()                               :   to accept the sentence in UPPER CASE
void sort(sortAlpha P)                          :   sorts the words of the sentence of object P in a alphabetical order and stores the 
                                                    sorted sentence in the current object 
void display()                                  :   display the original sentence along with the sorted sentence by invoking the method 
                                                    sort()
Specify the class SortAlpha giving details of the constructor(), void acceptSent(), void sort(SortAlpha) and void display(). Define a 
main() function to creat an object and the call function accordingly to enable the task.*/ 
//----------------------------------------------------------SOLUTION-------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;
public class SortAlpha {
    // Data Members
    private String sent;                                  // To store the sentence
    private int n;                                        // Number of words in the sentence

    // Default Constructor
    public SortAlpha() {
        sent = "";
        n = 0;
    }

    // Method to accept the sentence and check if it's in uppercase
    public void acceptSent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = scanner.nextLine();
        
        // Check if the sentence is in uppercase
        if (!sent.equals(sent.toUpperCase())) {
            System.out.println("Error: Sentence should be in UPPER CASE.");
            System.exit(1);                                         // Exit the program
        }

        // Count the number of words by splitting the sentence using space as a delimiter
        n = sent.split(" ").length;

        scanner.close();
    }

    // Method to sort the words of the sentence in alphabetical order
    public void sort(SortAlpha P) {
        // Split the sentence into words
        String[] words = P.sent.split(" ");

        // Sort the words in alphabetical order
        for (int i = 0; i < P.n - 1; i++) {
            for (int j = 0; j < P.n - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Reconstruct the sorted sentence
        sent = String.join(" ", words);
    }

    // Method to display the original and sorted sentences
    public void display() {
        System.out.println("Original Sentence: " + sent);
    }

    public static void main(String[] args)throws IOException  {
        SortAlpha sentence1 = new SortAlpha();
        sentence1.acceptSent();

        SortAlpha sentence2 = new SortAlpha();
        sentence2.sort(sentence1);

        sentence1.display();
        System.out.println("Sorted Sentence: " + sentence2.sent);
    }
}
