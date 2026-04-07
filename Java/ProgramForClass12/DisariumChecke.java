/* Q. A disarium number is number in which the sum of the digits to the power of their repective position is equal to the number itself.
      Design a class Disarium to check id a given number is a disarium number or not.
      Write a main method to test the class.
      Sample Input:
      Enter a number: 75
      Sample Output:
      75 is not a disarium number.
      Sample Input:
      Enter a number: 7
      Sample Output:
      7 is a disarium number.*/
//-------------------------------------------------------------------SOLUTION-------------------------------------------------------------------------
import java.util.Scanner;

public class DisariumChecker {
    public static void main(String[] args) {
        // Input a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of the Disarium class
        Disarium disariumObj = new Disarium();

        // Check and display whether the number is a Disarium number or not
        if (disariumObj.isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }
}

class Disarium {
    // Function to calculate the sum of digits to the power of their respective position
    private int sumOfDigitsToPower(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }

        return sum;
    }

    // Function to check if a number is a Disarium number
    public boolean isDisarium(int num) {
        return num == sumOfDigitsToPower(num);
    }
}
