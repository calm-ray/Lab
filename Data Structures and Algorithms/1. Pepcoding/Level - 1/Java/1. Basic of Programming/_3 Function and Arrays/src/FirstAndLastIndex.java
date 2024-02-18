import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        System.out.println(firstIndex(a, d)+" "+lastIndex(a, d));
    }

    private static int firstIndex(int[] a, int d) {
        int start = 0;
        int end = a.length - 1;
        int pi = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(d < a[mid]) {
                end = mid - 1;
            } else if(d > a[mid]) {
                start = mid + 1;
            } else {
                pi=mid;
                end = mid - 1;
            }
        }

        return pi;
    }

    private static int lastIndex(int[] a, int d) {
        int start = 0;
        int end = a.length - 1;
        int pi = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(d < a[mid]) {
                end = mid - 1;
            } else if(d > a[mid]) {
                start = mid + 1;
            } else {
                pi=mid;
                start = mid + 1;
            }
        }

        return pi;
    }
}
