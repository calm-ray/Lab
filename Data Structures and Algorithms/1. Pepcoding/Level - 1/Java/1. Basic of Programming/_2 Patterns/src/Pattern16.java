import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 2*n - 3;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+"\t");
            }

            // space
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            for(int j=i; j>=1; j--) {
                if(j!=n)
                    System.out.print(j+"\t");
            }

            space-=2;
            System.out.println();
        }
    }
}
