/*Q4. Print Square pattern.  */
public class ProblemQuestion4 {
    public static void main(String[] args) {
        int n = 5; // Size of the square pattern

        // Loop to print the square pattern
        for (int i = 1; i <= n * n; i++) {
            System.out.print("* "); // Print star followed by a space
            if (i % n == 0) {
                System.out.println(); // Move to the next line after every n stars
            }
        }
    }
}
