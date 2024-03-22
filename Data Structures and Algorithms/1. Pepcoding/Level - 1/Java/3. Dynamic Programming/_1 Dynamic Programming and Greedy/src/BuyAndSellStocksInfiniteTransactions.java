import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];
        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        int buy = 0;
        int sell = 0;
        int overallProfit = 0;
        while(sell != prices.length-1) {
            if(prices[sell+1] > prices[sell]) {
                sell+=1;
                continue;
            }
            overallProfit += prices[sell] - prices[buy];
            sell += 1;
            buy = sell;
        }

        overallProfit += prices[sell] - prices[buy];
        System.out.println(overallProfit);
    }
}
