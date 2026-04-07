/*Q3. Binomial Coefficient
      n = 5,
      r = 2
 */
public class ProblemQuestion3 {

    // Function to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate binomial coefficient C(n, r)
    public static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n - r);

        return nFact / (rFact * nMinusRFact);
    }

    public static void main(String[] args) {
        int n = 5; // Initialize variable n
        int r = 2; // Initialize variable r

        int binCoeff = binomialCoefficient(n, r); // Call the binomial coefficient function

        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + binCoeff); // Print the result
    }
}
