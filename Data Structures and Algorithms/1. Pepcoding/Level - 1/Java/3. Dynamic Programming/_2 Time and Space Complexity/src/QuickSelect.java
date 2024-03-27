import java.util.Scanner;

public class QuickSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(quickSelect(arr, 0, arr.length-1, k-1));
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        int pivot = arr[high];
        int pi = partition(arr, low, high, pivot);

        if(k > pi) {
            return quickSelect(arr, pi+1, high, k);
        } else if(k < pi){
            return quickSelect(arr, low, pi-1, k);
        } else {
            return pi;
        }
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;
        int j = low;

        while(i <= high) {
            if(arr[i] > arr[pivot]) {
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
