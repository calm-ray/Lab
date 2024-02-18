import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        displayArrayInReverse(arr, 0);
    }

    private static void displayArrayInReverse(int[] arr, int index) {
        if(index == arr.length)
            return;

        displayArrayInReverse(arr, index+1);
        System.out.print(arr[index]+" ");
    }
}
