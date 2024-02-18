import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1id = sc.nextInt();
        int t2id = sc.nextInt();
        int t3id = sc.nextInt();

        toi(n, t1id, t2id, t3id);

    }

    private static void toi(int n, int t1id, int t2id, int t3id) {
        if(n==0)
            return;

        toi(n-1, t1id, t3id, t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toi(n-1, t3id, t2id, t1id);
    }
}
