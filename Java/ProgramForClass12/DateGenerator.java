/* Q. Design a program to accept a day number (between 1 and 365 ) year (in 4 digits ) from the user to generate and display the corresponding date
      Also accept 'N'(1 <= N <= 365) days from the user and display the future date corresponding to 'N' days after the generated date. Display 
      an error message if the entered date is invalid.*/
//----------------------------------------------------------------SOLUTION-------------------------------------------------------------------------
import java.util.Scanner;

public class DateGenerator {
    public static void main(String[] args) {
        // Input day number and year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (between 1 and 365): ");
        int dayNumber = scanner.nextInt();
        System.out.print("Enter the year (4 digits): ");
        int year = scanner.nextInt();

        // Validate input
        if (!isValidDate(dayNumber, year)) {
            System.out.println("Error: Invalid date.");
            return;
        }

        // Display the generated date
        System.out.println("Generated Date: " + generateDate(dayNumber, year));
0.
        // Input the number of days (N)
        System.out.print("Enter the number of days (N): ");
        int N = scanner.nextInt();

        // Display the future date after N days
        System.out.println("Future Date after " + N + " days: " + calculateFutureDate(dayNumber, year, N));
    }

    // Function to check if a given date is valid
    private static boolean isValidDate(int dayNumber, int year) {
        if (year < 1000 || year > 9999 || dayNumber < 1 || dayNumber > 365) {
            return false;
        }

        int daysInYear = isLeapYear(year) ? 366 : 365;
        return dayNumber <= daysInYear;
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to generate the date from day number and year
    private static String generateDate(int dayNumber, int year) {
        int month = 1;
        while (dayNumber > getDaysInMonth(month, year)) {
            dayNumber -= getDaysInMonth(month, year);
            month++;
        }

        return String.format("%02d-%02d-%04d", month, dayNumber, year);
    }

    // Function to get the number of days in a specific month of a year
    private static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month];
    }

    // Function to calculate the future date after N days
    private static String calculateFutureDate(int dayNumber, int year, int N) {
        int totalDays = dayNumber + N;
        while (totalDays > (isLeapYear(year) ? 366 : 365)) {
            totalDays -= (isLeapYear(year) ? 366 : 365);
            year++;
        }

        return generateDate(totalDays, year);
    }
}
