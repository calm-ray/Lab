import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i=0; i<n; i++)
            integerArrayList.add(sc.nextInt());

        for(int i=integerArrayList.size()-1; i>=0; i--) {
            if(isPrime(integerArrayList.get(i)))
                integerArrayList.remove(i);
        }

        System.out.println(integerArrayList);
    }

    private static boolean isPrime(int num) {
        for(int i=2; i*i<=num; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
