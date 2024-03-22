import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(minCostPath(arr));
    }

    private static int minCostPath(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row][col];

        for(int i=row-1; i>=0; i--) {
            for(int j=col-1; j>=0; j--) {
                if(i==row-1 && j==col-1) {
                    dp[i][j] = arr[i][j];
                } else if(i==row-1) {
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                } else if(j==col-1) {
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                } else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        return dp[0][0];
    }
}
