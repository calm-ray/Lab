import java.util.Scanner;

public class TheStateOfWakanda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<arr[0].length; j++) {
            for(int i=0; i<n; i++) {
                if(j%2 == 0) {
                    System.out.println(arr[i][j]);
                } else {
                    System.out.println(arr[n-i-1][j]);
                }
            }
        }
    }
}
