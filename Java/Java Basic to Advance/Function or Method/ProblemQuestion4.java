/* Q4. Check if a number is prime or not (OPTIMIZED WAY) */
public class ProblemQuestion4 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Special case: 2 is a prime number
        if (n == 2) {
            return true;
        }
        // Check for factors from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If n is divisible by any number, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If no factors found, n is prime
        return true;
    }

    public static void main(String args[]) {
        // Test the isPrime function with the number 9
        System.out.println(isPrime(9)); // Output: false
    }
}
