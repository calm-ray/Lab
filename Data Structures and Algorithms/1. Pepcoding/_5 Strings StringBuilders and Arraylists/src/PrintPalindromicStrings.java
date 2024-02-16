import java.util.Scanner;

public class PrintPalindromicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                String tempStr = str.substring(i, j);
                if(isPalindrome(tempStr))
                    System.out.println(tempStr);
            }
        }
    }

    private static boolean isPalindrome(String tempStr) {
        int i = 0;
        int j = tempStr.length()-1;

        while(i<=j) {
            if(tempStr.charAt(i) != tempStr.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
