import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        brokenEconomy(a, d);
    }

    private static void brokenEconomy(int[] a, int d) {
        int start = 0;
        int end = a.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(d < a[mid]) {
                end = mid - 1;
            } else if(d > a[mid]) {
                start = mid + 1;
            } else {
                System.out.println(a[mid]+" "+a[mid]);
                return;
            }
        }

        System.out.println(a[start]+" "+a[end]);
    }
}
