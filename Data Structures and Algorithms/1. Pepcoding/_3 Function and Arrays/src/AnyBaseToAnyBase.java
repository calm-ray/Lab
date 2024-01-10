import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sourceBase = sc.nextInt();
        int  destinationBase= sc.nextInt();

        int valueInDecimal = getValueInDecimal(n, sourceBase);
        int result = getValueInBase(valueInDecimal, destinationBase);

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
