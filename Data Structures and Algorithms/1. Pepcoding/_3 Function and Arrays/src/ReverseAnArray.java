import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = a.length - 1;

        while(i<j) {
            int temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }

        for(int val: a) {
            System.out.print(val+" ");
        }
    }
}
