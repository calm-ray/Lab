import java.util.Scanner;

public class InvertedBarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(max < arr[i])
                max = arr[i];
        }

        for(int i=1; i<=max; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[j] >= i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
