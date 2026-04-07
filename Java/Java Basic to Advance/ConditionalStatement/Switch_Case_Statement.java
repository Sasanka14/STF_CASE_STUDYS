/*Q4. Write a Java program that uses a switch statement to check the value of an integer variable x. If x is 1, the program should 
      print "x is one". If x is 2, the program should print "x is two". For any other value of x, the program should print "x is 
      neither one nor two". */
public class Switch_Case_Statement{
    public static void main(String[] args) {
        // Declare and initialize the variable x
        int x = 2;
        
        // Use a switch statement to check the value of x
        switch (x) {
            // If x is 1, print "x is one"
            case 1:
                System.out.println("x is one");
                break;
            // If x is 2, print "x is two"
            case 2:
                System.out.println("x is two");
                break;
            // For any other value of x, print "x is neither one nor two"
            default:
                System.out.println("x is neither one nor two");
        }
    }
}

