import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int val: arr) {
            if(val > max) {
                max = val;
            }

            if(val < min) {
                min = val;
            }
        }

        System.out.println(max-min);
    }
}
