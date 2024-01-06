import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            System.out.println(isPrimeMoreOptimized(n));
        }
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMoreOptimized(int n) {
        if(n <= 1) {
            return false;
        }

        if(n==2 || n==3) {
            return true;
        }

        if(n%2==0 || n%3==0) {
            return false;
        }

        for(int i=5; i*i<=n; i+=6) {
            if(n%i == 0 || n%(i+2) == 0) {
                return false;
            }
        }
        return false;
    }
}
