import java.util.Scanner;

public class PrintKpc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printKpc(str, "");
    }

    public static String[] keypadCode = new String[]{".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private static void printKpc(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }

        String code = keypadCode[str.charAt(0)-48];
        for(char c: code.toCharArray()) {
            printKpc(str.substring(1), ans + c);
        }
    }
}
