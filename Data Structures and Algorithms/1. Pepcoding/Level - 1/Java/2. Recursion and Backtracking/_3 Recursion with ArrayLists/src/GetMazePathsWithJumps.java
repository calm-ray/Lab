import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        ArrayList<String> result = getMazePathsWithJumps(1, 1, row, col);
        System.out.println(result);
    }

    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if(dr==sr && dc==sc) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        ArrayList<String> result = new ArrayList<>();
        for(int s=1; s <= dc-sc; s++) {
            ArrayList<String> hpaths = getMazePathsWithJumps(sr, sc+1, dr, dc);
            int temp = s;
            result.addAll(hpaths.stream().map(str -> "h"+temp+str).toList());
        }

        for(int s=1; s <= dr-sr; s++) {
            ArrayList<String> vpaths = getMazePathsWithJumps(sr+1, sc, dr, dc);
            int temp = s;
            result.addAll(vpaths.stream().map(str -> "v"+temp+str).toList());
        }

        for(int s=1; s <= dc-sc && s <= dr-sr; s++) {
            ArrayList<String> dpaths = getMazePathsWithJumps(sr+1, sc+1, dr, dc);
            int temp = s;
            result.addAll(dpaths.stream().map(str -> "d"+temp+str).toList());
        }

        return result;
    }
}
