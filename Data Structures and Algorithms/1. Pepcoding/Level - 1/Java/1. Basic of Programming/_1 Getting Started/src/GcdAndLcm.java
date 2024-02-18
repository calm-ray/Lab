import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getGcd(a, b));
        System.out.println(getLcm(a, b));
    }

    public static int getGcd(int a, int b) {
        while(a%b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return b;
    }

    public static int getLcm(int a, int b) {
        int gcd = getGcd(a, b);
        return (a*b) / gcd;
    }
}
