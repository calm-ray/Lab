import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    private static int firstIndex(int[] arr, int index, int x){
        if(arr.length == index)
            return -1;

        if(arr[index] == x)
            return index;

        return firstIndex(arr, index+1, x);
    }
}
