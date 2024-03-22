import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(targetSumSubset(arr, target));
    }

    private static boolean targetSumSubset(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length+1][target+1];

        dp[0][0] = true;

        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(j==0) {
                    dp[i][j] = true;
                } else {
                    if(arr[i-1] <= j) {
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }

        // displayMatrix(dp);

        return dp[dp.length-1][dp[0].length-1];
    }

    private static void displayMatrix(boolean[][] arr) {
        for(boolean[] temp: arr) {
            for(boolean val: temp) {
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}
