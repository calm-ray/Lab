import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = getSum(b, n1, n2);
        System.out.println(result);
    }

    private static int getSum(int b, int n1, int n2) {
        int result = 0;
        int carry = 0;
        int multiplier = 1;
        while(n1!=0 || n2!=0 || carry!=0) {
            int val1 = n1%10;
            int val2 = n2%10;
            int sum = val1+val2+carry;
            int remainder = sum%b;
            carry = sum/b;

            result = result + remainder*multiplier;

            multiplier*=10;
            n1/=10;
            n2/=10;
        }

        return result;
    }
}
