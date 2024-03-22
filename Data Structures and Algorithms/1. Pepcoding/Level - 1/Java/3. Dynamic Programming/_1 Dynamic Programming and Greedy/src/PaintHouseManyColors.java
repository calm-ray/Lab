import java.util.Scanner;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colors = sc.nextInt();

        int[][] arr = new int[n][colors];

        for(int i=0; i<n; i++) {
            for (int j = 0; j<colors; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(paintHouseManyColorsSpaceOptimized(arr));
    }

    public static int paintHouseManyColors(int[][] arr) {
        int n = arr.length;
        int colors = arr[0].length;

        int[][] dp = new int[n][colors];

        for(int j=0; j<colors; j++) {
            dp[0][j] = arr[0][j];
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<colors; j++) {
                int min = Integer.MAX_VALUE;

                for(int k=0; k<colors; k++) {
                    if(k==j)
                        continue;
                    if(dp[i-1][k] < min)
                        min = dp[i-1][k];
                }

                dp[i][j] = arr[i][j] + min;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int j=0; j<colors; j++) {
            if(dp[n-1][j] < min)
                min = dp[n-1][j];
        }

        return min;
    }

    public static int paintHouseManyColorsSpaceOptimized(int[][] arr) {
        int n = arr.length;
        int colors = arr[0].length;

        int[][] dp = new int[n][colors];

        int firstMin;
        int secondMin;

        for(int j=0; j<colors; j++) {
            dp[0][j] = arr[0][j];
        }

        firstMin = firstMinValue(dp, 0);
        secondMin = secondMinValue(dp, 0, firstMin);

        for(int i=1; i<n; i++) {
            for(int j=0; j<colors; j++) {
                if(dp[i-1][j] != firstMin) {
                    dp[i][j] = arr[i][j] + firstMin;
                } else {
                    dp[i][j] = arr[i][j] + secondMin;
                }
            }

            firstMin = firstMinValue(dp, i);
            secondMin = secondMinValue(dp, i, firstMin);
        }

        int min = Integer.MAX_VALUE;
        for(int j=0; j<colors; j++) {
            if(dp[n-1][j] < min)
                min = dp[n-1][j];
        }

        return min;
    }

    public static int firstMinValue(int[][] arr, int i) {
        int firstMin = Integer.MAX_VALUE;
        for(int j=0; j<arr[0].length; j++) {
            if(arr[i][j] < firstMin) {
                firstMin = arr[i][j];
            }
        }
        return firstMin;
    }

    public static int secondMinValue(int[][] arr, int i, int firstMin) {
        int secondMin = Integer.MAX_VALUE;
        for(int j=0; j<arr[0].length; j++) {
            if(arr[i][j] < secondMin && arr[i][j] > firstMin) {
                secondMin = arr[i][j];
            }
        }
        return secondMin;
    }

}