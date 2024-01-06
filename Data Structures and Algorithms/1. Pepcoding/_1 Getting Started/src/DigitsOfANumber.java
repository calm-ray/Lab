import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDigitsOfANumber(n);
    }

    public static void printDigitsOfANumber(int n) {
        int divisor = (int) Math.pow(10, countDigits(n) - 1);

        while(n!=0) {
            System.out.println(n/divisor);
            n = n % divisor;
            divisor /= 10;
        }

    }

    public static int countDigits(int n) {
        return (int) Math.floor(Math.log10(n)+1);
    }
}
