import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int result = getValueInDecimal(n, b);
        System.out.println(result);
    }

    private static int getValueInDecimal(int n, int b) {
        int result = 0;
        int multiplier = 1;
        while(n!=0) {
            int digit = n%10;
            result = result + digit*multiplier;
            multiplier*=b;
            n/=10;
        }
        return result;
    }
}
