import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        targetSumSubsets(arr, 0, 0, target, "");
    }

    private static void targetSumSubsets(int[] arr, int index, int sum, int target, String ans) {
        if(index == arr.length) {
            if(sum == target)
                System.out.println(ans);
            return;
        }

        targetSumSubsets(arr, index+1, sum+arr[index], target, ans+arr[index]+", ");
        targetSumSubsets(arr, index+1, sum, target, ans);
    }

}
