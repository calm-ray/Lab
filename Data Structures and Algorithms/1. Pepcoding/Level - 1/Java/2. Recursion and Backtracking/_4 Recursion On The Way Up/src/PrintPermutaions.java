import java.util.Scanner;

public class PrintPermutaions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printPermutations(str, "");
    }

    private static void printPermutations(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        for(int i=0; i<str.length(); i++) {
            printPermutations(str.substring(0, i)+str.substring(i+1), ans + str.charAt(i));
        }
    }
}
