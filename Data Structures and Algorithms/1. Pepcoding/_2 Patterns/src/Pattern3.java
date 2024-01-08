import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         * int space = n-1;
         * int star = 1;
         *
         * for(int i=1; i<=n; i++) {
         *     for(int j=1; j<=space; j++) {
         *         System.out.print("\t");
         *     }
         *     for(int j=1; j<=star; j++) {
         *         System.out.print("*\t");
         *     }
         *     System.out.println();
         *     space--;
         *     star++;
         * }
         */

        for(int i=1; i<=n; i++) {
            // space
            for(int j=1; j<=n-i; j++) {
                System.out.print("\t");
            }
            // star
            for(int j=1; j<=i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
