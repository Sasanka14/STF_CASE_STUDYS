/* Q. A composite - Magic Number is positive integer which is Composite as well as a magic number.
      [NOTE: Compostie Number is a number that has more than two factors.
             Magic Number is a number in which is the eventual sum of the digits is equal to 1]
      Accept two positive integer values  m and n where m is less than n from the user. Display the number of composite magic integer that are in the 
       are in the range m and n(both inclusive) and output them along with freqency, in the given formate specifrd as below:
       Example 1:
            INPUT:
            m = 100
            n = 200

            OUTPUT:      
            The Composite Magic Integers are:
            100, 118, 136, 145, 154, 172, 190
            The frequency of Composite Magic Integers is : 7. */
//------------------------------------------------------------------------SOLUTION--------------------------------------------------------------------
import java.util.Scanner;

public class CompositeMagicNumbers {
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

        // Display Composite Magic Integers and their frequency
        System.out.println("The Composite Magic Integers are:");
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isComposite(i) && isMagicNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nThe frequency of Composite Magic Integers is: " + count);
    }

    // Function to check if a number is composite
    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }

    // Function to check if a number is a magic number
    private static boolean isMagicNumber(int num) {
        int sum = 0;

        while (num > 9) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return sum == 1;
    }
}
