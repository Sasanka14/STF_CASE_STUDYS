/*Q11. Write a Java program that takes a year from the user and print whether tha year is a leap year or not */
import java.util.Scanner;

public class ProblemQuestion11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Read the year from the user

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close(); // Close the scanner
    }
}
