import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        mergeSort(arr, 0, arr.length-1);
        targetSumPair(arr, target);
    }

    public static void targetSumPair(int[] arr, int target) {
        int i = 0;
        int j = arr.length-1;

        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum < target) {
                i++;
            } else if(sum > target) {
                j--;
            } else {
                System.out.format("[%d, %d]\n", arr[i], arr[j]);
                i++;
                j--;
            }
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0; i<n1; i++) {
            leftArr[i] = arr[start+i];
        }

        for(int j=0; j<n2; j++) {
            rightArr[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k = start;
        while(i<n1 && j<n2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
