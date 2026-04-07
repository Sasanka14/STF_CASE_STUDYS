/*Q4. What are the results of comparing two integer variables a and b using relational operators.  */
public class RelationOperators {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 10;
        int b = 20;

        // Perform relational operations and store results in boolean variables
        boolean isEqual = (a == b);     // Check if a is equal to b
        boolean isNotEqual = (a != b);  // Check if a is not equal to b
        boolean isGreaterThan = (a > b);  // Check if a is greater than b
        boolean isLessThan = (a < b);     // Check if a is less than b
        boolean isGreaterThanOrEqual = (a >= b);  // Check if a is greater than or equal to b
        boolean isLessThanOrEqual = (a <= b);     // Check if a is less than or equal to b

        // Output the results
        System.out.println("Is a equal to b? " + isEqual);
        System.out.println("Is a not equal to b? " + isNotEqual);
        System.out.println("Is a greater than b? " + isGreaterThan);
        System.out.println("Is a less than b? " + isLessThan);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual);
    }
}
