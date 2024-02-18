import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(getMultiplication(n1, n2, b));
    }

    public static int getMultiplication(int n1, int n2, int b) {
        int result = 0;
        int multiplier = 1;

        while(n2!=0) {
            int mulWithOneDigit = getMultiplicationWithOneDigit(n1, n2%10, b);
            result = getSum(b, mulWithOneDigit*multiplier, result);
            multiplier*=10;
            n2/=10;
        }

        return result;
    }
    public static int getMultiplicationWithOneDigit(int n1, int n2d, int b) {
        int result = 0;
        int carry = 0;
        int multiplier = 1;

        while(n1!=0 || carry!=0) {
            int n1d = n1%10;
            int val = n1d*n2d + carry;

            int remainder = val%b;
            carry = val/b;

            result = result + remainder*multiplier;

            multiplier*=10;
            n1/=10;
        }

        return result;
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
