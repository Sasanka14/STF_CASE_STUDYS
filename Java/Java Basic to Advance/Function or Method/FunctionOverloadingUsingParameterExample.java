/*
Write a Java program that demonstrates function overloading by creating multiple Sum methods that can handle different numbers of 
integer parameters. Implement a main method to test these overloaded methods by calling them with different sets of arguments and 
printing the results. */
public class FunctionOverloadingUsingParameterExample {
    
    // Overloaded function to sum two integers
    public static int Sum(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    // Overloaded function to sum three integers
    public static int Sum(int a, int b, int c) {
        return a + b + c; // Return the sum of a, b, and c
    }

    public static void main(String args[]) {
        // Call the Sum method with two arguments and print the result
        System.out.println(Sum(3, 5)); // Output: 8

        // Call the Sum method with three arguments and print the result
        System.out.println(Sum(5, 2, 1)); // Output: 8
    }
}
