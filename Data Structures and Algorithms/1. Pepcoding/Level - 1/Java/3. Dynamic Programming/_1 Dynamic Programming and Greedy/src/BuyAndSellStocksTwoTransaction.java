import java.util.Scanner;

public class BuyAndSellStocksTwoTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        int leastPriceTillNow = prices[0];
        int[] dp1 = new int[n];

        for(int i=1; i<prices.length; i++) {
            if(prices[i] < leastPriceTillNow) {
                leastPriceTillNow = prices[i];
            }

            int profitIfSoldToday = prices[i] - leastPriceTillNow;

            dp1[i] = Math.max(profitIfSoldToday, dp1[i - 1]);
        }

        int maxPriceTillNow = prices[prices.length-1];
        int[] dp2 = new int[n];

        for(int i=prices.length-2; i>=0; i--) {
            if(prices[i] > maxPriceTillNow) {
                maxPriceTillNow = prices[i];
            }

            int profitIfBoughtToday = maxPriceTillNow - prices[i];

            dp2[i] = Math.max(profitIfBoughtToday, dp2[i+1]);
        }

        int maxProfitAfterTwoTransactions = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++) {
            int totalOnCurrentDay = dp1[i] + dp2[i];
            if(maxProfitAfterTwoTransactions < totalOnCurrentDay) {
                maxProfitAfterTwoTransactions = totalOnCurrentDay;
            }
        }

        System.out.println(maxProfitAfterTwoTransactions);
    }
}
