import java.util.Scanner;

public class Rotate90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        transpose(arr);
        reverse(arr);
        displayMatrix(arr);
    }

    public static void displayMatrix(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i<j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    public static void reverse(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            int sc = 0;
            int ec = arr[0].length-1;

            while(sc < ec) {
                int temp = arr[i][sc];
                arr[i][sc++] = arr[i][ec];
                arr[i][ec--] = temp;
            }
        }
    }


}