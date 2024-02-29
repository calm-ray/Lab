import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] maze = new int[n][n];

        nQueens(maze, 0, "");
    }

    private static void nQueens(int[][] maze, int r, String ans) {
        if(r == maze.length) {
            System.out.println(ans);
            return;
        }

        for(int c=0; c<maze[0].length; c++) {
            if (isPlaceSafeForQueen(maze, r, c)) {
                maze[r][c] = 1;
                nQueens(maze, r + 1, ans + r + c + ", ");
                maze[r][c] = 0;
            }
        }

    }

    private static boolean isPlaceSafeForQueen(int[][] maze, int r, int c) {
        // vertical check
        for(int i=r-1; i>=0; i--) {
            if(maze[i][c] == 1)
                return false;
        }

        // left diagonal check
        for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--) {
            if(maze[i][j] == 1)
                return false;

        }

        // right diagonal check
        for(int i=r-1, j=c+1; i>=0 && j<maze[0].length; i--, j++) {
            if(maze[i][j] == 1)
                return false;
        }

        return true;
    }
}
