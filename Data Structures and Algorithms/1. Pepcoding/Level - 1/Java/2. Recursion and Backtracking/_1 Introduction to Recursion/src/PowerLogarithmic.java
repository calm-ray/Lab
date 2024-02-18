import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(powerLogarithmic(x, y));
    }

    private static int powerLogarithmic(int x, int y) {
        if(y == 0)
            return 1;

        int xpyb2 = powerLogarithmic(x, y/2);
        int xpy = xpyb2 * xpyb2;

        if(y%2 != 0)
            xpy *= x;

        return xpy;
    }
}
