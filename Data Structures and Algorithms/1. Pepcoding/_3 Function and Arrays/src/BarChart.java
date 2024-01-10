import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int val: arr) {
            if(max < val) {
                max = val;
            }
        }

        for(int i=1; i<=max; i++) {
            for(int j=0; j<arr.length; j++) {
                if((max - arr[j]) < i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
