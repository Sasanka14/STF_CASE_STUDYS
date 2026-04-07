/*Q9. Write a Java program to input week number (1 - 7) and print day of week name using switch case. */
import java.util.Scanner;

public class ProblemQuestion9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the week number
        System.out.print("Enter the week number (1 - 7): ");
        int weekNumber = scanner.nextInt();

        // Switch case to determine the day of the week based on the week number
        String dayOfWeek;
        switch (weekNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid week number";
        }

        // Print the day of the week
        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }
}
