import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int pivot = arr[high];
        int pi = partition(arr, low, high, pivot);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;
        int j = low;

        while(i <= high) {
            if(arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

        return j-1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
