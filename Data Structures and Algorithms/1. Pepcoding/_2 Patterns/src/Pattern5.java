import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars = 1;
        int space = n/2;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            for(int j=1; j<=stars; j++) {
                System.out.print("*\t");
            }
            if(i<=n/2) {
                stars+=2;
                space--;
            } else {
                stars-=2;
                space++;
            }
            System.out.println();
        }
    }
}
