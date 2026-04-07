/*Q. Write a Java program to swap the values of two variables using a third variable. Initially, a should be 5 and b should be 10. 
     Print the values before and after swapping. */
public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
