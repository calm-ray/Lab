import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char current = str.charAt(i);

            if(current >= 65 && current <=90)
                result.append((char) (current+32));
            else
                result.append((char) (current-32));
        }
        System.out.println(result);
    }
}
