import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> result = getSubsequence(str);
        System.out.println(result);
    }

    private static ArrayList<String> getSubsequence(String str) {
        if(str.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        ArrayList<String> resultIfCharacterExcluded = getSubsequence(str.substring(1));

        ArrayList<String> result = new ArrayList<>(resultIfCharacterExcluded);

        for (String s : resultIfCharacterExcluded) {
            result.add(str.charAt(0) + s);
        }

        return result;
    }
}
