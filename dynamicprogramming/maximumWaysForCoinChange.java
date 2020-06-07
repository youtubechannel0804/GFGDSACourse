package dynamicprogramming;

public class maximumWaysForCoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int sum = 5;

        System.out.println(totalWays(coins, sum));
    }

    private static int totalWays(int[] coins, int sum) {
        int[][] dp = new int[sum + 1][coins.length + 1];

        for (int i = 0; i <= coins.length ; i++) {
            dp[0] [i] = 1;
        }
        for (int i = 1; i <=sum ; i++) {
            dp[i] [0] = 0;
        }

        for (int i = 1; i <= sum ; i++) {
            for (int j = 1; j <= coins.length; j++) {



                    dp[i][j] = dp[i][j-1];
                    if(coins[j-1] <= i){
                        dp[i][j] = dp[i][j] + dp[i-coins[j-1]][j];
                    }

            }
        }

        return dp[sum][coins.length];
    }
}
