import java.util.Scanner;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        int i = 0;
        int j = arr[0].length-1;

        while(i<arr.length && j>=0) {
            if(k > arr[i][j]) {
                i++;
            } else if(k < arr[i][j]) {
                j--;
            } else {
                System.out.println(i+" "+j);
                return;
            }
        }

        System.out.println("Not found");
    }
}
