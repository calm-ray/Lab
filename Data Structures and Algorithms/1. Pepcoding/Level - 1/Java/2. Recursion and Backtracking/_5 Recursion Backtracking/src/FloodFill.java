import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] maze = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        floodFill(maze, 0, 0, "");
    }

    private static void floodFill(int[][] maze, int sr, int sc, String ans) {
        if(sr == maze.length-1 && sc == maze[0].length-1) {
            System.out.print(ans+" ");
            return;
        }
        if(sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1) {
            return;
        }

        maze[sr][sc] = 1;

        floodFill(maze, sr-1, sc, ans+"t");
        floodFill(maze, sr, sc-1, ans+"l");
        floodFill(maze, sr+1, sc, ans+"d");
        floodFill(maze, sr, sc+1, ans+"r");

        maze[sr][sc] = 0;
    }
}
