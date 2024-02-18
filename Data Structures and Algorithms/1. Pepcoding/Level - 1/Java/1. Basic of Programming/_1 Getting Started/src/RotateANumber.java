import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(getRotatedNumber(n, k));
    }

    public static int getRotatedNumber(int n, int k) {
        int noOfDigits = countOfDigits(n);
        if(k < 0) {
            k += noOfDigits;
        }
        k = k % noOfDigits;

        int divisor = (int) Math.pow(10, k);
        int remainder = n % divisor;
        int quotient = n / divisor;
        int result = (int) Math.pow(10, (noOfDigits - k)) * remainder + quotient;

        return result;
    }

    public static int countOfDigits(int n) {
        return (int) Math.floor(Math.log10(n)+1);
    }
}
