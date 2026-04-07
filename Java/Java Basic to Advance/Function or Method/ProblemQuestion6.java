/*Q6. Write a Java method to compute the average of three numbers */
import java.util.Scanner;

public class ProblemQuestion6 {

    // Method to compute the average of three numbers
    public static double computeAverage(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;  // Calculate the sum of the three numbers
        double average = sum / 3;  // Compute the average
        return average;  // Return the average value
    }

    // Method to ask the user for three numbers and return them as an array
    public static double[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        numbers[2] = scanner.nextDouble();
        
        scanner.close();  // Close the scanner
        return numbers;
    }

    public static void main(String[] args) {
        // Get the user input numbers
        double[] numbers = getUserNumbers();
        
        // Compute the average using the computeAverage method
        double average = computeAverage(numbers[0], numbers[1], numbers[2]);
        
        // Print the result
        System.out.println("The average of " + numbers[0] + ", " + numbers[1] + ", and " + numbers[2] + " is: " + average);
    }
}
