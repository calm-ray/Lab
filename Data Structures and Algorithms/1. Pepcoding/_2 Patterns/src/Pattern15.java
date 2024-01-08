import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n/2;
        int numbers = 1;
        int k = 1;
        for(int i=1; i<=n; i++) {

            // space
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

            int val = k;
            // numbers
            for(int j=1; j<=numbers; j++) {
                System.out.print(val+"\t");

                if(j <= numbers/2) {
                    val++;
                } else {
                    val--;
                }
            }

            if(i <= n/2) {
                space--;
                numbers+=2;
                k++;
            } else {
                space++;
                numbers-=2;
                k--;
            }
            System.out.println();
        }
    }
}
