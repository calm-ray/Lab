import java.util.Scanner;

public class PrintMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        printMazePathsWithJumps(1,1,row,col,"");
    }

    private static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String ans) {
        if(sr==dr && sc==dc) {
            System.out.print(ans+" ");
            return;
        }

        if(sr>dr || sc>dc) {
            return;
        }

        for(int jumps=1; jumps<=dc-sc; jumps++) {
            printMazePathsWithJumps(sr, sc+jumps, dr, dc, ans+"h"+jumps);
        }
        for(int jumps=1; jumps<=dr-sr; jumps++) {
            printMazePathsWithJumps(sr+jumps, sc, dr, dc, ans+"v"+jumps);
        }
        for(int jumps=1; jumps<=dc-sc && jumps<=dr-sr; jumps++) {
            printMazePathsWithJumps(sr+jumps, sc+jumps, dr, dc, ans+"d"+jumps);
        }
    }
}
