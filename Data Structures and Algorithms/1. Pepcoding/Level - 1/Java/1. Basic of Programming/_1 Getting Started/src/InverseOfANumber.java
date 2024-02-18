import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getInverse(n));
    }

    public static int getInverse(int n) {
        int count = 1;
        int result = 0;
        while(n!=0) {
            int digit = n % 10;
            result = result + (int)Math.pow(10, digit - 1) * count;
            count++;
            n /= 10;
        }

        return result;
    }
}
