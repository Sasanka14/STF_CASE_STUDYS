/*Q7. Write a method named isEven that accepts an int argument. The should return true if the argument is even or false otherwise.
      Also a program to test your method.
 */
public class ProblemQuestion7 {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; // Return true if the number is even, otherwise false
    }

    // Method to ask the user for an integer and test the isEven method
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Test the isEven method with the user input and print the result
        if (isEven(userInput)) {
            System.out.println(userInput + " is even.");
        } else {
            System.out.println(userInput + " is odd.");
        }

        scanner.close(); // Close the scanner
    }
}
