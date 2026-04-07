/*Q5. What are the results of performing logical operations on two boolean variables x and y in the Java program LogicalOperators ? */
public class LogicalOperators {
    public static void main(String[] args) {
        // Declare and initialize variables
        boolean x = true;
        boolean y = false;

        // Perform logical operations
        boolean andResult = x && y;   // Logical AND
        boolean orResult = x || y;    // Logical OR
        boolean notX = !x;            // Logical NOT on x
        boolean notY = !y;            // Logical NOT on y

        // Output the results
        System.out.println("x AND y: " + andResult);
        System.out.println("x OR y: " + orResult);
        System.out.println("NOT x: " + notX);
        System.out.println("NOT y: " + notY);
    }
}
