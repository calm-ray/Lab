import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> result = getKpc(str);
        System.out.println(result);
    }

    public static String[] keypadCode = new String[]{".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private static ArrayList<String> getKpc(String str) {
        if(str.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        ArrayList<String> resultIfCharacterExcluded = getKpc(str.substring(1));
        String keypadCodeString = keypadCode[str.charAt(0) - 48];
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<keypadCodeString.length(); i++) {
            for(String s: resultIfCharacterExcluded) {
                result.add(keypadCodeString.charAt(i)+s);
            }
        }

        return result;
    }
}
