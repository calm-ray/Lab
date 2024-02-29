import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] maze = new int[n][n];
        
        int srow = sc.nextInt();
        int scol = sc.nextInt();

        knightsTour(maze, srow, scol, 1);
    }

    private static void knightsTour(int[][] maze, int srow, int scol, int move) {
        if(srow<0 || scol<0 || srow >= maze.length || scol >= maze[0].length || maze[srow][scol] > 0) {
            return;
        }
        if(move == maze.length * maze.length) {
            maze[srow][scol] = move;
            display(maze);
            maze[srow][scol] = 0;
            return;
        }

        maze[srow][scol] = move;
        knightsTour(maze, srow-2, scol+1, move+1);
        knightsTour(maze, srow-1, scol+2, move+1);
        knightsTour(maze, srow+1, scol+2, move+1);
        knightsTour(maze, srow+2, scol+1, move+1);
        knightsTour(maze, srow+2, scol-1, move+1);
        knightsTour(maze, srow+1, scol-2, move+1);
        knightsTour(maze, srow-1, scol-2, move+1);
        knightsTour(maze, srow-2, scol-1, move+1);
        maze[srow][scol] = 0;
    }

    private static void display(int[][] maze) {
        for(int[] arr: maze) {
            for(int val: arr) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
