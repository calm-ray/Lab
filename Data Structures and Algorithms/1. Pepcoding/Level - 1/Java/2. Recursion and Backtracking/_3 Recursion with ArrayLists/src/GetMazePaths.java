import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        ArrayList<String> result = getMazePaths(1, 1, row, col);
        System.out.println(result);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(dr==sr && dc==sc) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        if(sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        ArrayList<String> hp = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vp = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> result = new ArrayList<>();
        result.addAll(hp.stream().map(s -> 'h'+s).toList());
        result.addAll(vp.stream().map(s -> 'v'+s).toList());

        return result;
    }
}
