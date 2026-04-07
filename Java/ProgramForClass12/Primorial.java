/* Q. Write a program to input a number and print its Primorial i.e. Primorial is defined to be the product of prime numbers.
                   Eg: i. 3# =  2*3   = 6
                       ii.5# =  2*3*5 = 30                                       */
 
//-------------------------------------------------SOLUTION------------------------------------------------------------------
 
import java.io.IOException;
import java.util.Scanner;
public class Primorial {
    // Data Member
    private int number;
    
    // Paramatrized Constructor
     public Primorial(int number) {
        this.number = number;
    }

    // Member Meathod
    public boolean isPrime(int n) {                                  // Method to check if a number is prime
       for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                  return false;
            }
        } 
        return true;
    }
    public long calculatePrimorial() {                               // Method to calculate the primorial
        long primorial = 1;
        int currentNumber = 2;
        for (;currentNumber<=this.number;currentNumber++){          //[for(int current number = 2; currentNumber <= this.number; currentNumber++)]
            if (isPrime(currentNumber)){
                primorial *= currentNumber;
            }
        }
        return primorial;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // Input a number from the user
        System.out.println("Enter the number:: ");
        int n = in.nextInt();
        // Create an instance of the Primorial class
        Primorial primeNumber = new Primorial(n);
        // Calculate and print the primorial
        long primorial = primeNumber.calculatePrimorial();
        System.out.println("Primorial of " + n + " is: " + primorial);
 
        in.close();
    }
}
