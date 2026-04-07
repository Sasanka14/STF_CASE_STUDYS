/*Q5. Print Reverse of a number */
import java.util.Scanner;

public class ProblemQuestion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reverse = 0;

        // Use a for loop to reverse the number
        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;   // Extract the last digit
            reverse = reverse * 10 + digit;  // Append the digit to the reverse number
        }

        System.out.println("Reversed number: " + reverse);

        scanner.close();
    }
}
