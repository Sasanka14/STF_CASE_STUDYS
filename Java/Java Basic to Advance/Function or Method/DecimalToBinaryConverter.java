/*Decimal to Binary Conversion. */
import java.util.Scanner;

public class DecimalToBinaryConverter {

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        // Convert decimal to binary
        while (decimal > 0) {
            int remainder = decimal % 2;  // Get the remainder
            binary.insert(0, remainder);  // Insert the remainder at the beginning of the binary string
            decimal = decimal / 2;  // Divide the decimal number by 2
        }
        
        return binary.toString();  // Return the binary string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert the decimal number to binary and print the result
        String binary = decimalToBinary(decimal);
        System.out.println("The binary value of decimal " + decimal + " is: " + binary);
        
        scanner.close();
    }
}
