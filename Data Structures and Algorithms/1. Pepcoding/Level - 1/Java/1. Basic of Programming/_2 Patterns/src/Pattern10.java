import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int so = n/2;
        int si = -1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=so; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j=1; j<=si; j++) {
                System.out.print("\t");
            }

            if(i!=1 && i!=n) {
                System.out.print("*\t");
            }

            if(i<=n/2) {
                so--;
                si+=2;
            } else {
                so++;
                si-=2;
            }
            System.out.println();
        }

    }
}
