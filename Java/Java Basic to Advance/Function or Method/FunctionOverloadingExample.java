/*Write a Java program that demonstrates function overloading by creating multiple add methods with different parameter types and 
counts. Implement a method that prompts the user to choose an operation, receives user inputs, and calls the appropriate add method 
based on the user's choice. Ensure your program can handle the following operations:

    1. Adding two integers.
    2. Adding three integers.
    3. Adding two double values.
    4. Concatenating two strings. */
import java.util.Scanner;

public class FunctionOverloadingExample {

    // Overloaded function: add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded function: add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded function: add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded function: concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Function to ask user for input and call the appropriate add function
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three integers");
        System.out.println("3. Add two doubles");
        System.out.println("4. Concatenate two strings");
        System.out.print("Enter the number of an operation::");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                // Ask the user for two integers
                System.out.print("Enter first integer: ");
                int int1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int int2 = scanner.nextInt();
                int sum1 = add(int1, int2);
                System.out.println("The sum of " + int1 + " and " + int2 + " is: " + sum1);
                break;
            case 2:
                // Ask the user for three integers
                System.out.print("Enter first integer: ");
                int int3 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int int4 = scanner.nextInt();
                System.out.print("Enter third integer: ");
                int int5 = scanner.nextInt();
                int sum2 = add(int3, int4, int5);
                System.out.println("The sum of " + int3 + ", " + int4 + ", and " + int5 + " is: " + sum2);
                break;
            case 3:
                // Ask the user for two double values
                System.out.print("Enter first double: ");
                double double1 = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double double2 = scanner.nextDouble();
                double sum3 = add(double1, double2);
                System.out.println("The sum of " + double1 + " and " + double2 + " is: " + sum3);
                break;
            case 4:
                // Ask the user for two strings
                System.out.print("Enter first string: ");
                String str1 = scanner.next();
                System.out.print("Enter second string: ");
                String str2 = scanner.next();
                String sum4 = add(str1, str2);
                System.out.println("The concatenation of '" + str1 + "' and '" + str2 + "' is: " + sum4);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
                break;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        FunctionOverloadingExample example = new FunctionOverloadingExample();
        example.getUserInput(); // Call the function to get user input and perform operations
    }
}
