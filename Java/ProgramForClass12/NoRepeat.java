/* Q. Design a class NoRepeat which checks weather a word has no repeated alphabets in it.
    Example : COMPUTER has no repeated alphabets but SCIENCE has repeated alphabets.
The details of the class are given below:
 CLASS NAME                                      : NoRepeat
 DATA MEMBERS / INSTANCE VARIABLES 
 word                                            : to store a word
 len                                             : to store the length of the word
 METHODS / MEMEBER FUNCTION
 Norepeat(String wd)                             : paramertized constructor to initialized word = wd
 boolean check()                                 : check weather a word has no repeated alphabets and return true else return false.
 void prn()                                      : display the word along with an approprite message 
 Specify the class NoRepeat, giving deatils of the constructor(String), boolean check() and void prn(). Define main() function to creat 
 an object and call the function accordingly to enable the task. */
 //-------------------------------------------------------------SOLUTION---------------------------------------------------------------
 import java.io.IOException;
 import java.util.Scanner;
public class NoRepeat {
    private String word;
    private int len;

    // Parameterized constructor to initialize and validate the word in uppercase
    public NoRepeat(String wd) {
        if (isUppercase(wd)) {
            word = wd;
            len = word.length();
        } else {
            throw new IllegalArgumentException("Input word must be in UPPER CASE.");
        }
    }

    // Method to check whether a word has no repeated alphabets and return true if it doesn't, else return false
    public boolean check() {
        // Create an array to mark visited characters
        boolean[] visited = new boolean[26];                                   // Assuming English alphabet

        // Traverse the word and check for repeated alphabets
        for (int i = 0; i < len; i++) {
            char currentChar = word.charAt(i);

            // If the current character is not visited, mark it as visited
            if (!visited[currentChar - 'A']) {
                visited[currentChar - 'A'] = true;
            } else {
                return false;                                               // If the character is already visited, it's a repeat
            }
        }
        return true;                                                        // If no repeated alphabets are found, return true
    }

    // Method to check if a string is in uppercase
    private boolean isUppercase(String str) {
        return str.equals(str.toUpperCase());
    }

    // Method to display the word along with an appropriate message
    public void prn() {
        if (check()) {
            System.out.println(word + " has no repeated alphabets.");
        } else {
            System.out.println(word + " has repeated alphabets.");
        }
    }

    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word in UPPER CASE: ");
        String inputWord = scanner.next();

        try {
            NoRepeat wordChecker = new NoRepeat(inputWord);
            wordChecker.prn();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
