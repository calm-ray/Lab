import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    private static int getDigitFrequency(int n, int d) {
        int count = 0;

        while(n!=0) {
            if(n%10==d)
                count++;
            n/=10;
        }

        return count;
    }
}