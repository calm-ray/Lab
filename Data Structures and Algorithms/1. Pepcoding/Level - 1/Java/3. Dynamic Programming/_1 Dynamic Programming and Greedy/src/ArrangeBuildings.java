import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prevBuilding = 1;
        int prevSapce = 1;

        for(int i=2; i<=n; i++) {
            int currZeros = prevSapce;
            int currOnes = prevBuilding + prevSapce;

            prevBuilding = currZeros;
            prevSapce = currOnes;
        }

        int result = prevBuilding + prevSapce;
        System.out.println(result*result);
    }
}
