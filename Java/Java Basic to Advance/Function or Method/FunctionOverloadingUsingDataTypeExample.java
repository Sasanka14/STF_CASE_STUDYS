/*Write a Java program that demonstrates function overloading by creating multiple Sum methods that can handle both integers and 
floating-point numbers. Implement a main method to test these overloaded methods by calling them with different sets of arguments and 
printing the results. */
public class FunctionOverloadingUsingDataTypeExample {

    // Overloaded function to sum two integers
    public static int Sum(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    // Overloaded function to sum two floating-point numbers
    public static float Sum(float a, float b) {
        return a + b; // Return the sum of a and b
    }

    public static void main(String[] args) {
        // Call the Sum method with two integer arguments and print the result
        System.out.println(Sum(3, 5)); // Output: 8

        // Call the Sum method with two float arguments and print the result
        System.out.println(Sum(3.5f, 2.5f)); // Output: 6.0
    }
}
