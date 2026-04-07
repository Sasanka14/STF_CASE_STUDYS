/* Q1. What will be the output of the following Java code that calculates the results of two different arithmetical expressions
using the given integer values for a and b? */
public class ArithmeticalExpression{
    public static void main(String args[]){
        int a = 12;
        int b = 0;
        int ans1 = 0;
        int ans2 = 0;
        ans1 = a * a + 2 * a * b + b * b ;
        ans2 = a * a * a - 3 * a * b * a + 3 * a * b;
        System.out.println("The value of first expression is " + ans1);
        System.out.println("The value of second expression is " + ans2);
    }
}