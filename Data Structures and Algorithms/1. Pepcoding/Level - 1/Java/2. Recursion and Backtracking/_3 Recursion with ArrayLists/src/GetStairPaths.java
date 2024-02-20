import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> result = getStairPaths(n);
        System.out.println(result);
    }

    private static ArrayList<String> getStairPaths(int n) {
        if(n == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        if(n < 0)
            return new ArrayList<>();

        ArrayList<String> jumpOne = getStairPaths(n-1);
        ArrayList<String> jumpTwo = getStairPaths(n-2);
        ArrayList<String> jumpThree = getStairPaths(n-3);

        ArrayList<String> result = new ArrayList<>();

        result.addAll(jumpOne.stream().map((s) -> "1" + s).toList());
        result.addAll(jumpTwo.stream().map((s) -> "2" + s).toList());
        result.addAll(jumpThree.stream().map((s) -> "3" + s).toList());

        return result;
    }
}
