import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prevZeros = 1;
        int prevOnes = 1;

        for(int i=2; i<=n; i++) {
            int currZeros = prevOnes;
            int currOnes = prevZeros + prevOnes;

            prevZeros = currZeros;
            prevOnes = currOnes;
        }

        System.out.println(prevZeros + prevOnes);
    }
}
