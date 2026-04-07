/*Q3. What will be the output of the following Java code that defines a method check to determine whether a number is positive, 
      negative, or neutral, and then tests it with the value of x being 0? */
public class If_Elseif_Statement {
    public static void check (int x) {
        // Check if the number is positive
        if (x > 0) {
            System.out.println("x is positive");
        }
        // Check if the number is negative
        else if (x < 0) {
            System.out.println("x is not positive");
        }
        // If the number is neither positive nor negative
        // it must be neutral
        else {
            System.out.println("x is neutral");
        }
    }

    public static void main(String[] args) {
        // Test the function with the sample number
        int x = 0;
        check(x);
    }
}
