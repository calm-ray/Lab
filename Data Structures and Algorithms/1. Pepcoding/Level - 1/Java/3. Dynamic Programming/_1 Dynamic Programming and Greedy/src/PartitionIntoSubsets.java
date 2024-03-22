import java.util.Scanner;

public class PartitionIntoSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // System.out.println(partitionIntoSubsetsRecursive(n, k));
        System.out.println(partitionIntoSubsetsDp(n, k));
    }

    private static int partitionIntoSubsetsRecursive(int n, int k) {
        if(n==0 || k==0 || n<k) {
            return 0;
        }
        if(n == k) {
            return 1;
        }
        return partitionIntoSubsetsRecursive(n-1, k) * k + partitionIntoSubsetsRecursive(n-1, k-1);
    }

    private static int partitionIntoSubsetsDp(int n, int k) {
        if(n==0 || k==0 || n<k) {
            return 0;
        }

        int[][] dp = new int[k+1][n+1];

        for(int i=1; i<=k; i++) {
            for(int j=1; j<=n; j++) {
                if(j<i)
                    dp[i][j] = 0;
                else if(j==i)
                    dp[i][j] = 1;
                else
                    dp[i][j] = i * dp[i][j-1] + dp[i-1][j-1];
            }
        }

        return dp[k][n];
    }
}
