import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printZigZag(n);
    }

    private static void printZigZag(int n) {
        if(n == 0 )
            return;

        System.out.print(n+"\t");
        printZigZag(n-1);
        System.out.print(n+"\t");
        printZigZag(n-1);
        System.out.print(n+"\t");
    }
}
