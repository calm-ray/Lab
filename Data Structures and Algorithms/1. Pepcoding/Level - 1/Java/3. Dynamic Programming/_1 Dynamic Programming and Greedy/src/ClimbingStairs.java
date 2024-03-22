import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println(climbingStairsRecursive(n));
        // System.out.println(climbingStairsMemoization(n, new int[n+1]));
        System.out.println(climbingStairsTabulation(n));
    }

    private static int climbingStairsRecursive(int n) {
        if(n == 0) {
            return 1;
        }

        if(n < 0) {
            return 0;
        }

        return climbingStairsRecursive(n-1) + climbingStairsRecursive(n-2) + climbingStairsRecursive(n-3);
    }

    private static int climbingStairsMemoization(int n, int[] qb) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        if(qb[n] != 0) {
            return qb[n];
        }
        qb[n] = climbingStairsMemoization(n-1, qb) + climbingStairsMemoization(n-2, qb) + climbingStairsMemoization(n-3, qb);
        return qb[n];
    }

    private static int climbingStairsTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];

    }


}
