import java.util.Scanner;

public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(coinChangePermutation(arr, target));
    }

    private static int coinChangePermutation(int[] arr, int target) {
        int[] dp = new int[target+1];

        dp[0] = 1;

        for(int i=1; i<dp.length; i++) {
            for(int j=0; j<arr.length && arr[j] <= i; j++) {
                dp[i] += dp[i-arr[j]];
            }
        }

        return dp[target];
    }
}

