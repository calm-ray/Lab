import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][3];

        for(int i=0; i<n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int prevRed = arr[0][0];
        int prevBlue = arr[0][1];
        int prevGreen = arr[0][2];

        for(int i=1; i<n; i++) {
            int currRed = Math.min(prevBlue, prevGreen) + arr[i][0];
            int currBlue = Math.min(prevRed, prevGreen) + arr[i][1];
            int currGreen = Math.min(prevRed, prevBlue) + arr[i][2];

            prevRed = currRed;
            prevBlue = currBlue;
            prevGreen = currGreen;
        }

        System.out.println(Math.min(prevRed, Math.min(prevBlue, prevGreen)));
    }
}