import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 1;
        int stars = n/2 + 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=stars; j++) {
                System.out.print("*\t");
            }

            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            for(int j=1; j<=stars; j++) {
                System.out.print("*\t");
            }

            if(i<=n/2) {
                stars--;
                space+=2;
            } else {
                stars++;
                space-=2;
            }

            System.out.println();
        }
    }
}
