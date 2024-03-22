import java.util.Scanner;

public class BuyAndSellStocksKTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        // System.out.println(buyAndSellStocksKTransactionOptimized(prices, k));
        System.out.println(buyAndSellStocksKTransactionOptimized(prices, k));
    }

    private static int buyAndSellStocksKTransactionDp(int[] prices, int k) {
        int[][] dp = new int[k+1][prices.length];

        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                dp[i][j] = dp[i][j-1];
                for(int x=0; x<j; x++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][x]+prices[j]-prices[x]);
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    private static int buyAndSellStocksKTransactionOptimized(int[] prices, int k) {
        int[][] dp = new int[k+1][prices.length];

        for(int i=1; i<dp.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < dp[0].length; j++) {
                max = Math.max(max, dp[i - 1][j - 1] - prices[j]);
                dp[i][j] = Math.max(max + prices[j], dp[i][j - 1]);
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
