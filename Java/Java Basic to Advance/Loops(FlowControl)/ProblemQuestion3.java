/*Q3. Print sum of first n natural number.  */
import java.util.Scanner;

public class ProblemQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}
