import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int result = getValueInBase(n, b);
        System.out.println(result);
    }

    private static int getValueInBase(int n, int b){
        int result = 0;
        int multiplier = 1;
        while(n!=0) {
            int digit = n%b;
            result = result + multiplier*digit;
            multiplier*=10;
            n/=b;
        }
        return result;
    }
}
