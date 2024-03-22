import java.util.Scanner;

public class PathWithMaximumGold {
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

        System.out.println(pathWithMaximumGold(arr));
    }

    private static int pathWithMaximumGold(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row][col];

        for(int j=col-1; j>=0; j--) {
            for(int i=0; i<row; i++) {
                if(j==col-1) {
                    dp[i][j] = arr[i][j];
                } else if(i==0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                } else if(i==row-1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<row; i++) {
            if(max < dp[i][0])
                max = dp[i][0];
        }

        return max;
    }
}
