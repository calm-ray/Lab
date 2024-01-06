import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printReverseOfANumber(n);
    }

    public static void printReverseOfANumber(int n) {
        while(n!=0) {
            System.out.println(n%10);
            n /= 10;
        }
    }
}
