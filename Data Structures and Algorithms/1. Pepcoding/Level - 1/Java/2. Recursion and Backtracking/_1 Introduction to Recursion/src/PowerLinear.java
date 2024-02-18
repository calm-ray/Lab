import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(powerLinear(x, y));
    }

    private static int powerLinear(int x, int y) {
        if(y == 0)
            return 1;
        return x * powerLinear(x, y-1);
    }
}
