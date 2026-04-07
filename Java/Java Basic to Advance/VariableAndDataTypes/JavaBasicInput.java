import java.util.Scanner;

public class JavaBasicInput {

    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt and read a string from the keyboard
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt and read an integer from the keyboard
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt and read a boolean from the keyboard
        System.out.print("Are you an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        // Print the input back to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is adult: " + isAdult);

        // Close the scanner
        scanner.close();
    }
}
