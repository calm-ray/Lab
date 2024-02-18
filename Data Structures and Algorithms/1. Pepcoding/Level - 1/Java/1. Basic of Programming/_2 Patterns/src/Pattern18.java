import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 0;
        int stars = n;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            for(int j=1; j<=stars; j++) {
                if((i>1 && i<=n/2) && (j>1 && j<stars)) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if(i<=n/2) {
                space++;
                stars-=2;
            } else {
                space--;
                stars+=2;
            }
            System.out.println();
        }
    }
}
