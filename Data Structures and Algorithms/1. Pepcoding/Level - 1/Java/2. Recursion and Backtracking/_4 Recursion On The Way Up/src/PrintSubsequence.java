import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSubsequence(str, "");
    }

    private static void printSubsequence(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }

        printSubsequence(str.substring(1), ans+str.charAt(0));
        printSubsequence(str.substring(1), ans);
    }
}
