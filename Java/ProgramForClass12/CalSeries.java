/* Q. A class CalSeries has been defined to calculate the sum of the series : 
       sum = 1 + x + x^2 + x^3 + .......... + x^n
Some of the members of the class are given below: 
CLASS NAME                          : CalSeries 
DATA MEMBER / INSTANCE VARIABLE 
x                                   : integer to store the value of x 
n                                   : integer to store the value of n 
sum                                 : integer to store the sum of the series 
MEMBER FUNCTIONS / METHODS 
CalSeries()                         : default constructor
void input()                        : to accept the values of x and n 
int power(int p, int q)             : return the power of p raised to q (p^q) using recursive technique
void call()                         : calculate the sum of the series by invoking the method power() abd display the result with an 
                                       appropriate message
Specify the class CalSeries, giving details of the constructor, void input(), int power(int , int), and void call(),.Define the main()
function to creat an object and call the member function accordingly to enable the task.*/
//----------------------------------------------------SOLUTION------------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;

public class CalSeries {
    private int x;
    private int n;
    private int sum;

    // Default constructor
    public CalSeries() {
        x = 0;
        n = 0;
        sum = 0;
    }

    // Method to accept the values of x and n
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
    }

    // Method to calculate p^q using recursive technique
    public int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return p * power(p, q - 1);
    }

    // Method to calculate the sum of the series
    public void call() {
        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += power(x, i);
        }
        System.out.println("Sum of the series: " + sum);
    }

    public static void main(String[] args) throws IOException {
        CalSeries calSeries = new CalSeries();
        calSeries.input();
        calSeries.call();
    }
}
