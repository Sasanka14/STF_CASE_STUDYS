/* Q3. With the help of if-elseif statement calculate the income tax.
           income < 5 lacks
           then 0 % tax 
           income between (5 - 10) lacks 
           then 20 % tax 
           income > 10 lacks
           then 30 % tax 
    Take income from the user.
 */
import java.util.Scanner;
public class ProblemQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter your annual income in lakhs: ");
        double income = scanner.nextDouble(); // Read the user input

        double tax;

        if (income < 5) {
            tax = 0;
        } else if (income >= 5 && income <= 10) {
            tax = 0.20 * income;
        } else {
            tax = 0.30 * income;
        }

        System.out.println("Your income tax is: " + tax + " lakhs");

        scanner.close(); // Close the scanner
    }
}
