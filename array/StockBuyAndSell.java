package array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};

        maximumBuyandSell(arr);
    }

    private static void maximumBuyandSell(int[] arr) {

        int profit = 0;
        //int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + arr[i] - arr[i - 1];
                // index = i;
            }
        }

        System.out.print(profit);
    }
}
