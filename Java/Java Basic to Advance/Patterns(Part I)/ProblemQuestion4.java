/*Q4. Print CHARACTER pattern.  
       A
       BC
       DEF
       GHIJ
       KLMNO
*/
public class ProblemQuestion4  {
    public static void main(String[] args) {
        char ch = 'A'; // Initialize the starting character
        int rows = 5; // Define the number of rows for the pattern

        // Outer loop to control the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to control the number of columns for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch); // Print character
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}
