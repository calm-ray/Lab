import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactorization(n);
    }

    public static void printPrimeFactorization(int n) {
        int i;
        for(i=2; i<n; i++) {
            while(n%i == 0) {
                System.out.print(i+" ");
                n /= i;
            }
        }

        if(i > 0)
            System.out.println(i);
    }
}
