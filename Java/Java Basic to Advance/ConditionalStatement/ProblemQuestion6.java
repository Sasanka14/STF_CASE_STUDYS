/* Q6. Make a calculator using switch-case Statement.
        This calculator perform the following task:
        + , - , * , /, % 
 */
import java.util.Scanner;

public class ProblemQuestion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input

        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Perform the selected operation using a switch-case statement
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Modulus by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Print the result
        System.out.println("Result: " + result);

        scanner.close(); // Close the scanner
    }
}
