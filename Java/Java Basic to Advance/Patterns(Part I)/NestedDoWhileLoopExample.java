public class NestedDoWhileLoopExample {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;
        
        // Outer do-while loop to control the number of rows
        do {
            int j = 1;
            
            // Inner do-while loop to control the number of columns for each row
            do {
                System.out.print("* ");
                j++;
            } while (j <= i); // Inner loop runs as long as j is less than or equal to i
            
            System.out.println(); // Move to the next line after each row is printed
            i++;
        } while (i <= rows); // Outer loop runs as long as i is less than or equal to rows
    }
}
