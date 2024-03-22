import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];

        for(int i=0; i<n; i++) {
            value[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            weight[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Item[] items = new Item[n];
        for(int i=0; i<n; i++) {
            double ratio = (value[i] * 1.0) / weight[i];
            items[i] = new Item(value[i], weight[i], ratio);
        }
        Arrays.sort(items);

        double result = 0;
        for(int i=0; i<items.length && target != 0; i++) {
            if(items[i].weight <= target) {
                target -= items[i].weight;
                result += items[i].value;
            } else {
                result += target * items[i].ratio;
                target = 0;
            }
        }

        System.out.println(result);
    }
    public static class Item implements Comparable<Item> {
        int value;
        int weight;
        double ratio;
        public Item(int value, int weight, double ratio) {
            this.value = value;
            this.weight = weight;
            this.ratio = ratio;
        }

        @Override
        public int compareTo(Item o) {
            return -Double.compare(this.ratio, o.ratio);
        }
    }
}


