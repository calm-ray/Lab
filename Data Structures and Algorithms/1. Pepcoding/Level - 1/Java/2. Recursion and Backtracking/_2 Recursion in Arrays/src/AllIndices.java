import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        System.out.println(Arrays.toString(allIndices(arr, x, 0, 0)));
    }

    private static int[] allIndices(int[] arr, int x, int index, int fsf) {
        if(arr.length == index) {
            return new int[fsf];
        }

        if(arr[index] == x)
            fsf += 1;

        int[] indicesUpToNow = allIndices(arr, x, index + 1, fsf);

        if(arr[index] == x)
            indicesUpToNow[fsf-1] = index;

        return indicesUpToNow;
    }
}
