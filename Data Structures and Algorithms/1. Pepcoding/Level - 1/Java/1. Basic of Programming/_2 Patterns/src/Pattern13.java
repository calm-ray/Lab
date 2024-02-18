import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(getnCr(i, j)+"\t");
            }
            System.out.println();
        }
    }

    public static int getnCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
