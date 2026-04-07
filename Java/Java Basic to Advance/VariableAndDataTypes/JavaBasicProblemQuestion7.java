/* Q7. In a program,in put the side of a square. You have to output the area of the square.
(Hint : area of a square is (side x side) */
import java.util.Scanner; // Import the Scanner class

public class JavaBasicProblemQuestion7 {
    public static void main(String args[]) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate the area of the square
        double area = side * side;

        // Print the result
        System.out.println("The area of the square is: " + area);

        // Close the scanner
        scanner.close();
    }
}
