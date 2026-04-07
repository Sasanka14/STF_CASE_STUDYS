/*Q9. Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */
import java.util.Scanner;

public class ProblemQuestion9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        
        System.out.println("Enter integers (type '0' to finish): ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        scanner.close();
    }
}
