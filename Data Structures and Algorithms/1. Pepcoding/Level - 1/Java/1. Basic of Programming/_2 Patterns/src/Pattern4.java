import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         * int space = 0;
         * int stars = n;
         * for(int i=1; i<=n; i++) {
         *     for(int j=1; j<=space; j++) {
         *         System.out.print("\t");
         *     }
         *     for(int j=1; j<=stars; j++) {
         *         System.out.print("*\t");
         *     }
         *     System.out.println();
         *     space++;
         *     stars--;
         * }
         */

        for(int i=1; i<=n; i++) {
            // space
            for(int j=1; j<=i-1; j++) {
                System.out.print("\t");
            }

            // stars
            for(int j=n; j>=i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
