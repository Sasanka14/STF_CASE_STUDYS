/* Q4. Area of a circle.
  Formula:  A = Pi*r^2. 
 */
import java.util.Scanner; // Import the Scanner class

public class JavaBasicProblemQuestion4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for reading input

        // Prompt and read the radius from the user
        System.out.print("Enter the radius: ");
        float r = in.nextFloat();

        // Define the value of π
        float pie = 3.14f;

        // Calculate the area of the circle
        float area = pie * r * r;

        // Print the area
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        in.close();
    }
}
