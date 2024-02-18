import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        displayArray(arr, 0);
    }

    private static void displayArray(int[] arr, int index) {
        if(index == arr.length)
            return;

        System.out.print(arr[index]+" ");
        displayArray(arr, index+1);
    }
}
