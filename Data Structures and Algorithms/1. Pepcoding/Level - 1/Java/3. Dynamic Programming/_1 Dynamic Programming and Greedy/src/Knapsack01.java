import java.util.Scanner;

public class Knapsack01 {
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

        System.out.println(knapsack01(value, weight, target));
    }

    private static int knapsack01(int[] value, int[] weight, int target) {
        int[][] dp = new int[value.length+1][target+1];

        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                if(j < weight[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]] + value[i-1]);
                }
            }
        }

        // display(dp);
        return dp[dp.length-1][dp[0].length-1];
    }

    private static void display(int[][] dp) {
        for(int[] temp: dp) {
            for(int val: temp) {
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}
