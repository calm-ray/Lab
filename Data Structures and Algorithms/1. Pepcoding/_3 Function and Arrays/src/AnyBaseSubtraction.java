import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(getDifference(b, n1, n2));
    }

    private static int getDifference(int b, int n1, int n2) {
        int result = 0;
        int carry = 0;
        int multiplier = 1;

        while(n2!=0) {
            int val1 = n1%10;
            int val2 = n2%10;

            int sum = val2+carry;

            if(sum < val1) {
                carry = -1;
                sum = sum + b - val1;
            } else {
                sum = sum - val1;
            }

            result = result + sum*multiplier;
            multiplier*=10;

            n1/=10;
            n2/=10;
        }

        return result;
    }
}
