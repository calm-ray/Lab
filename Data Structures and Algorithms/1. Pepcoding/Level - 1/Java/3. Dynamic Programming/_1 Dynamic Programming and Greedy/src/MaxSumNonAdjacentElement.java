import java.util.Arrays;
import java.util.Scanner;

public class MaxSumNonAdjacentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(maxSumRecursive(arr, 0));

        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(maxSumMemoization(arr, 0, dp));

        // System.out.println(maxSumDp(arr));

        System.out.println(maxSumDpSpaceOptimized(arr));
    }

    public static int maxSumRecursive(int[] arr, int index) {
        if(index >= arr.length)
            return 0;

        int whenIncluded = arr[index] + maxSumRecursive(arr, index+2);
        int whenExcluded = maxSumRecursive(arr, index+1);

        return Math.max(whenIncluded, whenExcluded);
    }

    public static int maxSumMemoization(int[] arr, int index, int[] dp) {
        if(index >= arr.length) {
            System.out.println(Arrays.toString(dp));
            return 0;
        }

        if(dp[index] != -1) {
            return dp[index];
        }

        int whenIncluded = arr[index] + maxSumMemoization(arr, index+2, dp);
        int whenExcluded = maxSumMemoization(arr, index+1, dp);

        dp[index] = Math.max(whenIncluded, whenExcluded);

        return dp[index];
    }

    public static int maxSumDp(int[] arr) {
        int[][] dp = new int[2][arr.length];

        dp[0][0] = arr[0];
        dp[1][0] = 0;

        for(int j=1; j<dp[0].length; j++) {
            dp[0][j] = arr[j] + dp[1][j-1];
            dp[1][j] = Math.max(dp[0][j-1], dp[1][j-1]);
        }

        for(int[] temp: dp) {
            for(int val: temp) {
                System.out.print(val+" ");
            }
            System.out.println();
        }

        return  Math.max(dp[0][dp[0].length-1], dp[1][dp[0].length-1]);
    }

    public static int maxSumDpSpaceOptimized(int[] arr) {
        int prevValWhenIncluded = arr[0];
        int prevValWhenExcluded = 0;

        for(int i=1; i<arr.length; i++) {
            int currValWhenIncluded = prevValWhenExcluded + arr[i];
            int currValWhenExcluded = Math.max(prevValWhenIncluded, prevValWhenExcluded);

            prevValWhenIncluded = currValWhenIncluded;
            prevValWhenExcluded = currValWhenExcluded;
        }

        return Math.max(prevValWhenIncluded, prevValWhenExcluded);
    }
}
