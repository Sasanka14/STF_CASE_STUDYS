/*Q2. Factorial of a number , n 
               n = 4
 */
public class ProblemQuestion2 {

    // Function to calculate factorial of a number and print each step
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println("Factorial at step " + i + " is: " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4; // Initialize variable n

        int fact = factorial(n); // Call the factorial function

        System.out.println("The final factorial of " + n + " is: " + fact); // Print the final result
    }
}
