/*How function works With parameter. */
public class DemoCodeExample {

    // Function that adds two integers and returns the result
    public int add(int a, int b) {
        int sum = a + b;
        return sum; // Return the result
    }

    // Function that checks if a number is even and returns a boolean
    public boolean isEven(int number) {
        return number % 2 == 0; // Return true if the number is even, false otherwise
    }

    // Function that prints a greeting message
    public void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        DemoCodeExample example = new DemoCodeExample(); // Create an instance of DemoCode

        // Call the add function and print the result
        int sum = example.add(5, 3);
        System.out.println("The sum of 5 and 3 is: " + sum);

        // Call the isEven function and print the result
        boolean even = example.isEven(4);
        System.out.println("Is 4 even? " + even);

        // Call the printGreeting function
        example.printGreeting("Sasanka");
    }
}
