/*Q. Write a Java program to swap the values of two variables without using a third variable. Initially, a should be 5 and b 
     should be 10. Print the values before and after swapping. */
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
