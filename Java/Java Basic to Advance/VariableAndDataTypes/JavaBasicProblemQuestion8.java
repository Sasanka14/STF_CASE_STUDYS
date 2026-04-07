/* Q8. Enter cost of 3 items from the user (using float datatype)-a pencil, a pen and an eraser. You have to output the total 
cost of the items back to the user as their bill
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/
import java.util.Scanner; // Import the Scanner class

public class JavaBasicProblemQuestion8 {
    public static void main(String args[]) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost of each item
        System.out.print("Enter the cost of the pencil: ");
        float pencilCost = scanner.nextFloat();
        
        System.out.print("Enter the cost of the pen: ");
        float penCost = scanner.nextFloat();
        
        System.out.print("Enter the cost of the eraser: ");
        float eraserCost = scanner.nextFloat();

        // Calculate the total cost
        float totalCost = pencilCost + penCost + eraserCost;

        // Calculate the total cost including 18% GST
        float gst = totalCost * 0.18f;
        float totalCostWithGst = totalCost + gst;

        // Print the total cost
        System.out.println("Total cost of the items: " + totalCost);

        // Print the total cost including GST
        System.out.println("Total cost including 18% GST: " + totalCostWithGst);

        // Close the scanner
        scanner.close();
    }
}
