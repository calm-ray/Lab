import java.util.Arrays;
import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        // linear search
        System.out.println(linearSearch(arr, d));

        // binary search - might give wrong result because we need to sort the data first
        // System.out.println(binarySearch(arr, d));
    }

    private static int linearSearch(int[] arr, int d) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==d) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int d) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(d < arr[mid]) {
                end = mid - 1;
            } else if(d > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
