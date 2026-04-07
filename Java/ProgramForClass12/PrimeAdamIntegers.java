/* Q. A P..rime - Adam integer is a positive integer(without leading zeros) which is a prime as well as Adam number.
     [NOTE: Prime number is a number that is only divisible by 1 and itself.
      Adam number is a sqaure of a number and the sqaure of its reverse to each other]
      Accept two positive integers m and n where m is less than n as user input. Display all prime - adam integers that are in the range between m 
      and n (both inclusive) and output them along with the frequency, in the given formate  below:
      Example 1:
        INPUT:
        m=5
        n = 100
        OUTPUT:
        The Prime-Adam integers are: 11, 13, 31
        Frequency of Prime-Adam integers is: 3

        Example 2:
        INPUT:
        m = 100
        n = 200
        OUTPUT:
        The Prime-Adam integers are: 101, 103, 113
        Frequency of Prime-Adam integers is: 3 .*/
//-----------------------------------------------------------------------SOLUTION-------------------------------------------------------------------
import java.util.Scanner;

public class PrimeAdamIntegers {
    public static void main(String[] args) {
        // Input the range (m and n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Validate input
        if (m >= n) {
            System.out.println("Error: m should be less than n.");
            return;
        }

        // Display Prime-Adam integers and their frequency
        System.out.println("The Prime-Adam integers are: ");
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdamNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nFrequency of Prime-Adam integers is: " + count);
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

    // Function to check if a number is an Adam number
    private static boolean isAdamNumber(int num) {
        int square = num * num;
        int reverseSquare = reverseNumber(square);

        return reverseSquare * reverseSquare == reverseNumber(num);
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
