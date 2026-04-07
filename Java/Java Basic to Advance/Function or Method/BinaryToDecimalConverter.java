/*Binary to Decimal Conversion. */
import java.util.Scanner;

public class BinaryToDecimalConverter {

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        // Iterate over each character in the binary string
        for (int i = 0; i < length; i++) {
            // Get the current character (either '0' or '1')
            char bit = binary.charAt(length - 1 - i);
            
            // If the character is '1', add the corresponding power of 2 to the decimal value
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        // Convert the binary number to decimal and print the result
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal value of binary " + binary + " is: " + decimal);
        
        scanner.close();
    }
}
