import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] qb = new int[n+1];

        // System.out.println(fiboRecursive(n));
        System.out.println(fiboMemoized(n, qb));
    }

    private static int fiboRecursive(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }

    private static int fiboMemoized(int n, int[] qb) {
        if(n==0 || n==1) {
            return n;
        }

        if(qb[n] != 0) {
            return qb[n];
        }

        int fibN = fiboMemoized(n-1, qb) + fiboMemoized(n-2, qb);
        qb[n] = fibN;

        return fibN;
    }


}
