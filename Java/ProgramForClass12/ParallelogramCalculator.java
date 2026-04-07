/* Q. A super class Perimeter has been defined to calculate the perimeter of a parallogram. Define a subclass Area to compute the area of the area
      of the parallogram by using the formula A = 2 * (b * h) where b is the base and h is the height.
      Write a program to accept the base and height of the parallogram and display the area.
      Input Format:
      The first line of the input contains the base and height of the parallogram.
      Output Format:
      The output should contain the area of the parallogram.
      Sample Input:
      5 10
      Sample Output:
      50
      Explanation:
      The area of the parallogram is 50.
      Sample Input:
      10 20
      Sample Output:
      200
      Explanation:
      The area of the parallogram is 200.
      Sample Input:
      15 25
      Sample Output:
      375
      Explanation:
      The area of the parallogram is 375.*/
//---------------------------------------------------------------------SOLUTION---------------------------------------------------------------------
import java.util.Scanner;

// Superclass
class Perimeter {
    // Method to calculate the perimeter of a parallelogram
    public double calculatePerimeter(double base, double height) {
        return 2 * (base + height);
    }
}

// Subclass
class Area extends Perimeter {
    // Method to calculate the area of a parallelogram
    public double calculateArea(double base, double height) {
        return 2 * (base * height);
    }
}

public class ParallelogramCalculator {
    public static void main(String[] args) {
        // Input base and height of the parallelogram
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base and height of the parallelogram: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Create an instance of the Area class
        Area areaObj = new Area();

        // Calculate and display the area of the parallelogram
        double parallelogramArea = areaObj.calculateArea(base, height);
        System.out.println("The area of the parallelogram is: " + parallelogramArea);
    }
}
