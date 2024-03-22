import java.util.Scanner;

public class ClimbingStairsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(climbingStairsWithJump(arr));
    }

    private static int climbingStairsWithJump(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n+1];

        dp[n] = 1;

        for(int i=n-1; i>=0; i--) {
            for(int j=1; j<=arr[i] && i+j <=n; j++) {
                dp[i] += dp[i+j];
            }
        }

        return dp[0];
    }
}