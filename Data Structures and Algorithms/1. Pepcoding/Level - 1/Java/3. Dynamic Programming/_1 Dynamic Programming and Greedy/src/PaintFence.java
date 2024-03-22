import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int prevCountWhereConsecutiveSame = 0;
        int prevCountWhereConsecutiveDiff = 0;

        for(int i=2; i<=n; i++) {
            int currCountWhereConsecutiveSame = i==2?k:prevCountWhereConsecutiveDiff;
            int currCountWhereConsecutiveDiff = (i==2?k:prevCountWhereConsecutiveSame+prevCountWhereConsecutiveDiff)*(k-1);

            prevCountWhereConsecutiveSame = currCountWhereConsecutiveSame;
            prevCountWhereConsecutiveDiff = currCountWhereConsecutiveDiff;
        }

        System.out.println(prevCountWhereConsecutiveDiff+prevCountWhereConsecutiveSame);
    }
}
