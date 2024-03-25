import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        countSort(arr, min, max);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr, int min, int max) {
        int range = max-min+1;
        int[] freqArr = new int[range];
        int[] res = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            freqArr[arr[i]-min]++;
        }

        for(int i=1; i<freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        for(int i=arr.length-1; i>=0; i--) {
            int val = arr[i];
            int valIndex = val - min;
            res[freqArr[valIndex] - 1] = val;
            freqArr[valIndex]--;
        }

        System.arraycopy(res, 0, arr, 0, res.length);
    }
}
