/* Q3. What are the results of performing binary  operations on variables a and b in the Java program? */
public class BinaryArithmeticExpression {
    public static void main(String args[]) {
        int a = 22;
        int b = 5;
        int sum = 0;
        int difference = 0;
        int product = 0;
        int quotient = 0;
        int remainder = 0;

        // Perform  binary  operations
        sum = a + b;               // Calculate the sum of a and b
        difference = a - b;        // Calculate the difference between a and b
        product = a * b;           // Calculate the product of a and b
        quotient = a / b;          // Calculate the quotient of a divided by b
        remainder = a % b;         // Calculate the remainder of a divided by b

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
