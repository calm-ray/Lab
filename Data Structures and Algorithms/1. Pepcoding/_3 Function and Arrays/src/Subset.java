import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<Math.pow(2,n); i++) {
            int temp = i;
            String ans = "";

            for(int j=0; j<n; j++) {
                int rem = temp % 2;
                temp /= 2;

                if(rem == 0) {
                    ans = "-\t" + ans;
                } else {
                    ans = arr[n-1-j] + "\t" + ans;
                }
            }

            System.out.println(ans);
        }
    }
}
