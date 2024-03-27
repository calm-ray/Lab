import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length-1)));
    }

    private static int[] mergeSort(int[] arr, int low, int high) {
        if(low == high) {
            int[] res = new int[1];
            res[0] = arr[low];
            return res;
        }
        int mid = (low+high)/2;
        int[] firstSortedArray = mergeSort(arr, low, mid);
        int[] secondSortedArray = mergeSort(arr, mid+1, high);
        return mergeTwoSortedArray(firstSortedArray, secondSortedArray);
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                result[k] = arr1[i++];
            } else {
                result[k] = arr2[j++];
            }
            k++;
        }

        while(i<arr1.length) {
            result[k++] = arr1[i++];
        }

        while(j<arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
