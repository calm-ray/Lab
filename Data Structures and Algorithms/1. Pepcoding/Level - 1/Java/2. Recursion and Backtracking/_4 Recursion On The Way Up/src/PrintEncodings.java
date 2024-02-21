import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printEncodings(str, "");
    }

    private static void printEncodings(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }

        char ch = str.charAt(0);

        if(ch == '0')
            return;

        char code = (char) ((ch-'0')+96);
        printEncodings(str.substring(1), ans+code);

        if(str.length() > 1) {
            String firstTwoCharacter = str.substring(0,2);
            int val = Integer.parseInt(firstTwoCharacter);
            if(val <= 26) {
                printEncodings(str.substring(2), ans+(char)(val+96));
            }
        }

    }
}
