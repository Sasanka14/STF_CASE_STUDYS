/*Q5. Check if a Student will PASS OR FAIL. using Ternary Operator.  
  marks >= 33 : PASS
  marks <= 33 : FAIL
*/
import java.util.Scanner;

public class ProblemQuestion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt(); // Read the user input

        // Ternary operator to check if the marks are above or equal to the passing threshold
        String result = (marks >= 33) ? "PASS" : "FAIL";

        System.out.println("Result: " + result);

        scanner.close(); // Close the scanner
    }
}
