/* VERY IMPORTANT.
    
     Performing a Question Name Trapping Rainwater.  */
import java.util.Scanner;

public class TrappingRainwater {

    // Function to compute the trapped water using auxiliary arrays
    public static int trapRainwater(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] left_max = new int[n];
        int[] right_max = new int[n];
        int trappedWater = 0;

        // Fill left_max array
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }

        // Fill right_max array
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        // Calculate the trapped water
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return trappedWater;
    }

    // Function to print the diagram
    // This is optional for better understanding 
    public static void printDiagram(int[] height) {
        int n = height.length;
        int maxHeight = 0;

        // Find the maximum height for the diagram
        for (int h : height) {
            if (h > maxHeight) maxHeight = h;
        }

        // Print the diagram
        for (int level = maxHeight; level > 0; level--) {
            for (int i = 0; i < n; i++) {
                if (height[i] >= level) {
                    System.out.print("|"); // Bar
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            System.out.println();
        }

        // Print the base
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements in the height array
        System.out.print("Enter the number of elements in the height array: ");
        int n = scanner.nextInt();

        int[] height = new int[n];

        // Input: elements of the height array
        System.out.println("Enter the elements of the height array: ");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }
        
        // Print the diagram
        System.out.println("Diagram of the bars:");
        printDiagram(height);

        // Calculate and print the total trapped rainwater
        System.out.println("Total trapped rainwater: " + trapRainwater(height));

        scanner.close();
    }
}
