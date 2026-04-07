/*Q6. Write a Java program that uses the ternary operator to check if an integer variable x is positive. If x is greater than 0, 
      the program should assign the string "x is positive" to a variable result. Otherwise, it should assign "x is not positive" to 
      result. Finally, print the value of result. */
public class TernaryOperator {
    public static void main(String[] args)
    {
        // Define an integer variable x and assign the value
        // 10 to it
        int x = 10;

        // Use a ternary operator to check if x is positive
        // or not If x is greater than 0, assign "x is
        // positive" to the result variable Otherwise,
        // assign "x is not positive" to the result variable
        String result = (x > 0) ? "x is positive"
                                : "x is not positive";

        // Print the result to the console
        System.out.println(result);
    }
}
