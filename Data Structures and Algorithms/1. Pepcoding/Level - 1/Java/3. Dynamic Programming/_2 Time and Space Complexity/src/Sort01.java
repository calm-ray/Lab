import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sort01(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort01(int[] arr) {
        int i = 0;
        int j = 0;

        while(i<arr.length) {
            if(arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, j);
                i++;j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
