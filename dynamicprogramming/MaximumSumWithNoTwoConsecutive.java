package dynamicprogramming;

public class MaximumSumWithNoTwoConsecutive {
    public static void main(String[] args) {

        int[] arr = {10, 5, 15, 20};

        System.out.println(maxSumRecrsive(arr, arr.length));
        System.out.println(maxSumDP(arr));
        System.out.println(optimizedSolution(arr));

    }

    private static int maxSumRecrsive(int[] arr, int length) {

        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return arr[0];
        } else if (length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        return Math.max(maxSumRecrsive(arr, length - 1), maxSumRecrsive(arr, length - 2) + arr[length - 1]);
    }

    private static int optimizedSolution(int[] arr) {

        int prev = arr[0];
        int pre_prev = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            int res = arr[i] + pre_prev;
            pre_prev = prev;
            prev = Math.max(res, prev);
        }

        return prev;
    }

    private static int maxSumDP(int[] arr) {

        int[] dp = new int[arr.length + 1];

        dp[0] = 0;
        dp[1] = arr[0];
        dp[2] = Math.max(arr[0], arr[1]);

        for (int i = 3; i <= arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i - 1]);
        }
        return dp[arr.length];
    }
}

