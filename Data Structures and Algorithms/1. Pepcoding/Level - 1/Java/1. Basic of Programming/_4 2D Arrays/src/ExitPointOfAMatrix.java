import java.util.Scanner;

public class ExitPointOfAMatrix {
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

        int count = 0;
        int i = 0;
        int j = 0;
        while(true) {
            count = (count + arr[i][j]) % 4;
            if(count == 1) {
                i++;
            } else if(count == 2) {
                j--;
            } else if(count == 3) {
                i--;
            } else if(count == 0){
                j++;
            }

            if(i<0) {
                i++;
                break;
            } else if(i>=arr.length) {
                i--;
                break;
            } else if(j<0) {
                j++;
                break;
            } else if(j>=arr[0].length) {
                j--;
                break;
            }

        }

        System.out.println(i+" "+j);
    }
}
