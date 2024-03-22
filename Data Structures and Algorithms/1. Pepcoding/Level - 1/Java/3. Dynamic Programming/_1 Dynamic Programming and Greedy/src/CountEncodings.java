import java.util.Scanner;

public class CountEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] dp = new int[str.length()];

        dp[0] = 1;

        for(int i=1; i<str.length(); i++) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i-1);

            if(prevChar == '0') {
                if(currChar == '0') {
                    dp[i] = 0;
                } else {
                    dp[i] = dp[i-1];
                }
            } else {
                if(currChar == '0' && (prevChar == '1' || prevChar == '2')) {
                    dp[i] = ((i>=2) ? dp[i-2] : 1);
                } else {
                    if(Integer.parseInt(str.substring(i-1, i+1)) <= 26) {
                        dp[i] = dp[i-1] + ((i>=2) ? dp[i-2] : 1);
                    } else {
                        dp[i] = dp[i-1];
                    }
                }
            }
        }

        System.out.println(dp[dp.length-1]);
    }
}
