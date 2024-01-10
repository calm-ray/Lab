import java.util.Scanner;

public class SumOfTwoArrays {
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

        int[] result = new int[Math.max(n1, n2)];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = result.length - 1;
        int carry = 0;
        while(k>=0) {
            int sum = carry;

            if(i>=0) {
                sum += a1[i];
            }

            if(j>=0) {
                sum += a2[j];
            }
            result[k] = sum%10;
            carry = sum/10;
            i--; j--; k--;
        }

        if(carry != 0) {
            System.out.print(carry+" ");
        }

        for(int val: result) {
            System.out.print(val+" ");
        }


    }
}
