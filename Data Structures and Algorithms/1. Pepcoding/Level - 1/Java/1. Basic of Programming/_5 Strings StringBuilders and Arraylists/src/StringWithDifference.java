import java.util.Scanner;

public class StringWithDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder(str.charAt(0)+"");

        for(int i=1; i<str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            result.append(curr-prev);
            result.append(curr);
        }
        System.out.println(result);
    }
}
