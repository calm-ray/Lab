import java.util.Scanner;

public class PermutationOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<factorial(str.length()); i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for(int div=str.length(); div>=1; div--) {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }

            System.out.println();
        }
    }

    private static int factorial(int n) {
        if(n <= 1)
            return 1;
        return n * factorial(n-1);
    }
}
