package dynamicprogramming;

public class LongestIncreatingSubSequence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(lisDP(arr));

        int[] arr1 = {3, 4, 2, 8, 10};

        System.out.println(lisDP(arr1));

        // TODO nlogn solution
    }


    private static int lisDP(int[] arr) {

        int[] dp = new int[arr.length + 1];
        dp[0] = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            max = Math.max(dp[i], max);
        }
        return max;


    }
}
