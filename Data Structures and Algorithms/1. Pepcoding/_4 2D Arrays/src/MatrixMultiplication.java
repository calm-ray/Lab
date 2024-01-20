import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();

        int[][] arr2 = new int[n2][m2];

        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // check if arr1 column is equal to arr2's rows
        if(m1 != n2) {
            System.out.println("Invalid Input");
            return;
        }

        int rrow = n1;
        int rcol = m2;

        int[][] result = new int[rrow][rcol];

        for(int i=0; i<rrow; i++) {
            for(int j=0; j<rcol; j++) {
                for(int k=0; k<n2; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
