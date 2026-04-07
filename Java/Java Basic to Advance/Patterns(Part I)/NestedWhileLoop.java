/* Nested while loop. */
public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1; // Initialization of the outer loop control variable
        
        // Outer while loop
        while (i <= 5) {
            int j = 1; // Initialization of the inner loop control variable
            
            // Inner while loop
            while (j <= 5) {
                // Print the product of i and j
                System.out.print((i * j) + "\t");
                
                // Increment the inner loop control variable
                j++;
            }
            
            // Move to the next line after printing each row of the table
            System.out.println();
            
            // Increment the outer loop control variable
            i++;
        }
    }
}
