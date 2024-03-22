import java.util.Scanner;

public class BuyAndSellStocksOneTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];

        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        int leastPriceTillNow = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < leastPriceTillNow) {
                leastPriceTillNow = prices[i];
            }

            int profitIfSoldToday = prices[i] - leastPriceTillNow;

            if(profitIfSoldToday > maxProfit) {
                maxProfit = profitIfSoldToday;
            }
        }

        System.out.println(maxProfit);
    }
}
