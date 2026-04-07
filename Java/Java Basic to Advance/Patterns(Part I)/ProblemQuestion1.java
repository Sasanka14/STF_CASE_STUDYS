/*Q1. Print STAR " * " pattern. */
public class ProblemQuestion1 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the pattern

        // Outer loop to control the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to control the number of columns for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}
