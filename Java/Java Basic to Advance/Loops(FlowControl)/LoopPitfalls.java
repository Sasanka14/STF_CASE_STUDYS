public class LoopPitfalls {
    public static void main(String[] args) {
        // Infinite Loop Example
        int i = 0;
        System.out.println("Infinite Loop Example:");
        while (i >= 0) { // This condition is always true, causing an infinite loop
            System.out.println("i = " + i);
            i++; // Incrementing i, but it will always be non-negative
            if (i > 10) break; // Adding a break condition to prevent infinite loop for this example
        }

        // Off-by-One Error Example
        System.out.println("\nOff-by-One Error Example:");
        for (int j = 1; j <= 5; j++) { // This loop runs one extra iteration than intended
            System.out.println("j = " + j); // This prints numbers 1 to 5 correctly
        }

        // Logical Error Example
        int sum = 0;
        System.out.println("\nLogical Error Example:");
        for (int k = 1; k < 5; k++) { // Intended to sum numbers 1 to 5, but the condition is incorrect
            sum += k;
        }
        System.out.println("Sum of numbers from 1 to 5 (incorrectly) = " + sum); // This will print 10 instead of 15
    }
}
