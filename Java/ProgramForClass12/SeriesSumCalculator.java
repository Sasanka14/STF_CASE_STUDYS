/* Q. A class series sum is designed to calculate the sum of the following series:
      Sum = x^2 / 1! +  x^4 / 2! + x^6 / 3! + ...... + x^n / n!
      where x and n are integers and n > 0.
      Create a class with a static method that calculates the sum and returns the value of the sum.*/
//----------------------------------------------------------------SOLUTION--------------------------------------------------------------------------
import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        // Input values for x and n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of n (n > 0): ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: Please enter a positive value for n.");
            return;
        }

        // Calculate and display the sum using the static method
        double result = SeriesSum.calculateSeriesSum(x, n);
        System.out.println("Sum of the series: " + result);
    }
}

class SeriesSum {
    // Static method to calculate the sum of the series
    public static double calculateSeriesSum(int x, int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            // Calculate each term of the series: x^(2i) / (2i)!
            double term = Math.pow(x, 2 * i) / factorial(2 * i);
            sum += term;
        }

        return sum;
    }

    // Static method to calculate factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
