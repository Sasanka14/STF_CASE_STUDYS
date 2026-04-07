import java.util.Scanner;

public class BuyAndSellStock {

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
        System.out.println("Maximum profit: " + maxProfit(prices));

        scanner.close();
    }
}
