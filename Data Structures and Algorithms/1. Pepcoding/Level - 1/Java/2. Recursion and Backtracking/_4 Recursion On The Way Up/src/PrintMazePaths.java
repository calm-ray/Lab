import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        printMazePaths(1,1,row, col, "");
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if(sr==dr && sc==dc) {
            System.out.print(ans+" ");
        }

        if(sr>dr || sc>dc) {
            return;
        }
        printMazePaths(sr, sc+1, dr, dc, ans+"h");
        printMazePaths(sr+1, sc, dr, dc, ans+"v");
    }
}
