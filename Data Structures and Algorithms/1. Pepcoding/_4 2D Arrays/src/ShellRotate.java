import java.util.Scanner;

public class ShellRotate {
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

        int s = sc.nextInt();
        int k = sc.nextInt();

        rotateShell(arr, s, k);
        displayMatrix(arr);
    }

    private static void rotateShell(int[][] arr, int s, int k) {
        int[] oneD = fill1DFrom2D(arr, s);
        rotateArray(oneD, k);
        fill2Dfrom1D(arr, s, oneD);
    }

    private static void fill2Dfrom1D(int[][] arr, int s, int[] oneD) {
        int sr = s - 1;
        int sc = s - 1;
        int er = arr.length-s;
        int ec = arr[0].length-s;

        int index = 0;

        for(int i=sr; i<=er; i++) {
            arr[i][sc] = oneD[index++];
        }
        sc++;

        for(int j = sc; j<=ec; j++) {
            arr[er][j] = oneD[index++];
        }
        er--;

        for(int i=er; i>=sr; i--) {
             arr[i][ec] = oneD[index++];
        }
        ec--;

        for(int j=ec; j>=sc; j--) {
            arr[sr][j] = oneD[index++];
        }
    }

    private static void rotateArray(int[] oneD, int k) {
        if(k < 0) k+=oneD.length;

        k %= oneD.length;

        reverse(oneD, 0, oneD.length-k-1);
        reverse(oneD, oneD.length-k, oneD.length-1);
        reverse(oneD, 0, oneD.length-1);
    }

    private static void reverse(int[] oneD, int i, int j) {
        while(i<j) {
            int temp = oneD[i];
            oneD[i++] = oneD[j];
            oneD[j--] = temp;
        }
    }

    private static int[] fill1DFrom2D(int[][] arr, int s) {
        int sr = s - 1;
        int sc = s - 1;
        int er = arr.length-s;
        int ec = arr[0].length-s;
        int size = 2 * (er - sr + ec - sc);

        int[] oneD = new int[size];
        int index = 0;

        for(int i=sr; i<=er; i++) {
            oneD[index++] = arr[i][sc];
        }
        sc++;

        for(int j = sc; j<=ec; j++) {
            oneD[index++] = arr[er][j];
        }
        er--;

        for(int i=er; i>=sr; i--) {
            oneD[index++] = arr[i][ec];
        }
        ec--;

        for(int j=ec; j>=sc; j--) {
            oneD[index++] = arr[sr][j];
        }

        return oneD;
    }

    private static void displayMatrix(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
