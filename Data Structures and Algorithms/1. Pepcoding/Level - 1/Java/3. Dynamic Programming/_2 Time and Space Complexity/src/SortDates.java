import java.util.Arrays;
import java.util.Scanner;

public class SortDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        sortDates(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortDates(String[] arr) {
        countSort(arr, 1000000, 100, 32);
        countSort(arr, 10000, 100, 13);
        countSort(arr, 1, 10000, 2501);
    }

    public static void countSort(String[] arr, int div, int mod, int range) {
        int[] freqArr = new int[range];
        String[] res = new String[arr.length];

        for(int i=0; i<arr.length; i++) {
            freqArr[Integer.parseInt(arr[i], 10)/div%mod]++;
        }

        for(int i=1; i<freqArr.length; i++) {
            freqArr[i] = freqArr[i-1] + freqArr[i];
        }

        for(int i=arr.length-1; i>=0; i--) {
            int val = Integer.parseInt(arr[i], 10)/div%mod;
            res[freqArr[val]-1] = arr[i];
            freqArr[val]--;
        }

        System.arraycopy(res, 0, arr, 0, res.length);
    }
}