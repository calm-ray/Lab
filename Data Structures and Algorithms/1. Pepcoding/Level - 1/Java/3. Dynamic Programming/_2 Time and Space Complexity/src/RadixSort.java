import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }

        radixSort(arr, max);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr, int max) {
        int digitsInMax = (int)Math.floor(Math.log10(max) + 1);
        int base =  1;
        for(int i=1; i<=digitsInMax; i++) {
            countSort(arr, base);
            base *= 10;
        }
    }

    private static void countSort(int[] arr, int base) {
        int[] freqArr = new int[10];
        int[] res = new int[arr.length];

        // calculating frequencies of digits
        for(int i=0; i<arr.length; i++) {
            freqArr[(arr[i]/base)%10]++;
        }

        // storing cumulative frequencies
        for(int i=1; i<freqArr.length; i++) {
            freqArr[i] = freqArr[i-1] + freqArr[i];
        }

        for(int i=arr.length-1; i>=0; i--) {
            int val = (arr[i]/base)%10;
            res[freqArr[val]-1] = arr[i];
            freqArr[val]--;
        }

        System.arraycopy(res, 0, arr, 0, res.length);
    }
}
