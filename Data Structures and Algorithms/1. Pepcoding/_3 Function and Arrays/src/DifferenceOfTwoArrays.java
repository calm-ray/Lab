import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for(int i=0; i<a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];

        for(int i=0; i<a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] result = new int[n2];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = result.length - 1;
        int carry = 0;

        while(k>=0) {
            int d = a2[j]+carry;
            int a1val = i>=0 ? a1[i] : 0;

            if(d < a1val) {
                carry = -1;
                d = d+10-a1val;
            } else {
                carry = 0;
                d = d-a1val;
            }

            result[k] = d;
            i--; j--; k--;
        }

        int idx = 0;

        while(idx< result.length) {
            if(result[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while(idx < result.length) {
            System.out.print(result[idx++]+" ");
        }
    }
}
