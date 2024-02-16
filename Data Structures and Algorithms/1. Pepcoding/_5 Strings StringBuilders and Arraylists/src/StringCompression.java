import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(firstCompression(str));
        System.out.println(secondCompression(str));
    }
    private static String firstCompression(String str) {
        StringBuilder result = new StringBuilder(str.charAt(0)+"");
        for(int i=1; i<str.length(); i++) {
            char prev = str.charAt(i-1);
            char current = str.charAt(i);

            if(current != prev) {
                result.append(current);
            }
        }
        return result.toString();
    }

    private static String secondCompression(String str) {
        StringBuilder sb = new StringBuilder(str.charAt(0)+"");
        int count = 1;

        for(int i=1; i<str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);

            if(current == prev) {
                count++;
            } else {
                if(count > 1)
                    sb.append(count);
                sb.append(current);
                count = 1;
            }
        }

        if(count > 1)
            sb.append(count);
        return sb.toString();
    }
}
