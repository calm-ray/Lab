import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];

        for(int i=0; i<n; i++) {
            value[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            weight[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(unboundedKnapsack(value, weight, target));
    }

    private static int unboundedKnapsack(int[] value, int[] weight, int target) {
        int[] dp = new int[target+1];

        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<value.length; j++) {
                if(i >= weight[j]) {
                    dp[i] = Math.max(dp[i], dp[i-weight[j]]+value[j]);
                }
            }
        }

        return dp[dp.length-1];
    }
}
