/*Q. Print numbers from 1 to 5 using a do-while loop. */
public class BasicDoWhileLoop {
    public static void main(String[] args) {
        int number = 1; // Initialize the number to 1

        // Use a do-while loop to print numbers from 1 to 5
        do {
            System.out.println(number); // Print the current number
            number++; // Increment the number by 1
        } while (number <= 5); // Continue the loop as long as the number is less than or equal to 5
    }
}
