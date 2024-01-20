import java.util.Scanner;

public class SpiralDisplay {
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

        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        while(startRow <= endRow && startCol <= endCol) {
            for(int i=startRow; i<=endRow; i++) {
                System.out.println(arr[i][startCol]);
            }
            startCol++;

            for(int i=startCol; i<=endCol; i++) {
                System.out.println(arr[endRow][i]);
            }
            endRow--;

            if(endCol > startCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.println(arr[i][endCol]);
                }
                endCol--;
            }

            if(endRow > startRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.println(arr[startRow][i]);
                }
                startRow++;
            }
        }
    }
}
