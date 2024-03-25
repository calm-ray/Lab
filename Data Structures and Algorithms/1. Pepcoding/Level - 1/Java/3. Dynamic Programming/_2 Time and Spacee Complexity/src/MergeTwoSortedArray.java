import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

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

        System.out.println(Arrays.toString(result));
    }
}
