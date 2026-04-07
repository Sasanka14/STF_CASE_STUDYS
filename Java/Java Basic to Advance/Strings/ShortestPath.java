/*Q. Given a string representing a route with directions (E, W, N, S), write a program to find the shortest path to the destination. For example, for input "WNEENSENNN", return the shortest path to the final destination. */
import java.util.Scanner;

public class ShortestPath {

    // Function to calculate the net displacement in x and y coordinates
    public static int[] calculateDisplacement(String route) {
        int x = 0; // Horizontal displacement
        int y = 0; // Vertical displacement

        // Loop through the route and calculate net displacement
        for (int i = 0; i < route.length(); i++) {
            char direction = route.charAt(i);
            switch (direction) {
                case 'E':
                    x++; // Move East
                    break;
                case 'W':
                    x--; // Move West
                    break;
                case 'N':
                    y++; // Move North
                    break;
                case 'S':
                    y--; // Move South
                    break;
            }
        }
        
        return new int[]{x, y}; // Return net displacement as an array [x, y]
    }

    // Function to determine the shortest path based on net x and y coordinates
    public static String getShortestPath(int[] displacement) {
        int x = displacement[0];
        int y = displacement[1];
        StringBuilder shortestPath = new StringBuilder();

        // For horizontal direction
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                shortestPath.append('E'); // Move East if x is positive
            }
        } else if (x < 0) {
            for (int i = 0; i < Math.abs(x); i++) {
                shortestPath.append('W'); // Move West if x is negative
            }
        }

        // For vertical direction
        if (y > 0) {
            for (int i = 0; i < y; i++) {
                shortestPath.append('N'); // Move North if y is positive
            }
        } else if (y < 0) {
            for (int i = 0; i < Math.abs(y); i++) {
                shortestPath.append('S'); // Move South if y is negative
            }
        }

        return shortestPath.toString(); // Return the shortest path as a string
    }

    // Function to calculate the Euclidean distance from origin (0, 0)
    public static double calculateDistance(int[] displacement) {
        int x = displacement[0];
        int y = displacement[1];

        // Applying the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(x * x + y * y); // Since (x1, y1) is (0, 0)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the route
        System.out.print("Enter the route: ");
        String route = sc.nextLine();
        
        // Step 1: Calculate the net displacement
        int[] displacement = calculateDisplacement(route);
        
        // Step 2: Print the final coordinates (x, y)
        System.out.println("Final coordinates: (" + displacement[0] + ", " + displacement[1] + ")");

        // Step 3: Find the shortest path
        String shortestPath = getShortestPath(displacement);
        System.out.println("The shortest path to the destination is: " + shortestPath);

        // Step 4: Calculate and print the Euclidean distance
        double distance = calculateDistance(displacement);
        System.out.println("The Euclidean distance to the destination is: " + distance);

        sc.close();
    }
}
