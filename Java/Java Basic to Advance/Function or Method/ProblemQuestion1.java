/*Q1. Product of a & b.
      a = 3, 
      b = 5
 */
public class ProblemQuestion1 {

    // Function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 3; // Initialize variable a
        int b = 5; // Initialize variable b

        int product = multiply(a, b); // Call the multiply function

        System.out.println("The product of " + a + " and " + b + " is: " + product); // Print the result
    }
}
