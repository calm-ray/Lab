import java.util.Arrays;
import java.util.Scanner;

public class PartitioningAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        partition(arr, pivot);
        System.out.println(Arrays.toString(arr));
    }

    public static void partition(int[] arr, int pivot) {
        int i = 0;
        int j = 0;

        while(i<arr.length) {
            if(arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}