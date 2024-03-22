import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransactionsWithFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        int fees = sc.nextInt();
        System.out.println(buyAndSellStocksInfiniteTransactionWithFeeDp(prices, fees));
    }

    private static int buyAndSellStocksInfiniteTransactionWithFeeDp(int[] prices, int fees) {
        int[][] dp = new int[2][prices.length];

        for(int i=0; i<prices.length; i++) {
            if(i==0) {
                dp[0][i] = -prices[i];
            } else {
                dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1] - prices[i]);
                dp[1][i] = Math.max(dp[1][i-1], prices[i] - fees + dp[0][i-1]);
            }
        }

        return dp[1][prices.length-1];
    }
}
