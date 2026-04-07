/* Q. A GoldBach number is a positive even integer that can be expressed as the sum of two primes.
      [NOTE: All even integer numbers greater than 4 are GoldBach Number.]*/
//----------------------------------------------------------------SOLUTION-----------------------------------------------------------------------
import java.util.Scanner;

public class GoldbachNumbers {
    public static void main(String[] args) {
        // Input an even number greater than 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an even number greater than 4: ");
        int evenNumber = scanner.nextInt();

        // Validate input
        if (evenNumber <= 4 || evenNumber % 2 != 0) {
            System.out.println("Error: Please enter an even number greater than 4.");
            return;
        }

        // Find and display Goldbach numbers
        System.out.println("Goldbach numbers for " + evenNumber + ":");
        findGoldbachNumbers(evenNumber);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to find and display Goldbach numbers
    private static void findGoldbachNumbers(int evenNumber) {
        for (int i = 2; i <= evenNumber / 2; i++) {
            if (isPrime(i) && isPrime(evenNumber - i)) {
                System.out.println(i + " + " + (evenNumber - i));
            }
        }
    }
}
