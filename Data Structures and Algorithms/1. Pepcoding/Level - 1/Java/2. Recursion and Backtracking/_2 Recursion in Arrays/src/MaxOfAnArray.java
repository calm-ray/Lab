import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println(maxOfAnArray(arr, 0));
    }

    private static int maxOfAnArray(int[] arr, int index) {
        if(arr.length == index)
            return -1;

        int returnedMax = maxOfAnArray(arr, index + 1);
        if(returnedMax < arr[index])
            returnedMax = arr[index];

        return returnedMax;
    }
}
