/*Q3. You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum 
profit you can achieve from this transaction. If you cannot achieve any profit, return 0.  */
import java.util.Scanner;

public class ProblemQuestion3 {

    // Function to find the maximum profit
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Update the maximum profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of days
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        // Input: stock prices
        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Calculate and print the maximum profit
        int profit = maxProfit(prices);
        if (profit > 0) {
            System.out.println("Maximum profit: " + profit);
        } else {
            System.out.println("No profit can be achieved");
        }

        scanner.close();
    }
}
