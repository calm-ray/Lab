import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransactionsWithCoolDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(buyAndSellStocksInfiniteTransactionsWithCoolDown(prices));
    }

    private static int buyAndSellStocksInfiniteTransactionsWithCoolDown(int[] prices) {
        int[][] dp = new int[prices.length][3];

        dp[0][0] = -prices[0];

        for(int i=1; i<dp.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], prices[i] + dp[i-1][0]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]);
        }

        return dp[prices.length-1][1];
    }
}
