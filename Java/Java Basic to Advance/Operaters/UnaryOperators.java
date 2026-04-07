/* Q2. What will be the output of the following Java code that demonstrates the use of unary operators 
(post-increment, pre-increment, post-decrement, and pre-decrement)? */
public class UnaryOperators {
    // main function
    public static void main(String[] args) {
        // Integer declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
