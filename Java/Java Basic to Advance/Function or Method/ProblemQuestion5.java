/* Q5. Print all Prime Numbers in a Range.
          n = 10
 */
public class ProblemQuestion5 {

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

    // Function to print all prime numbers in a given range
    public static void primeInRange(int n) {
        // Loop through all numbers from 2 to n-1
        for (int i = 2; i < n; i++) {
            // Check if the number is prime
            if (isPrime(i)) {
                // Print the prime number
                System.out.println("Prime Number: " + i);
            }
        }
    }

    public static void main(String args[]) {
        int n = 10; // Define the range limit
        primeInRange(n); // Call the function to print all primes in the range
    }
}
