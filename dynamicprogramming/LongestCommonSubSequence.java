package dynamicprogramming;

public class LongestCommonSubSequence {

    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";

        System.out.println(lcsRecursive(s1, s2, s1.length(), s2.length()));
        System.out.println(lcsDp(s1, s2, s1.length(), s2.length()));
    }

    private static int lcsDp(String s1, String s2, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    private static int lcsRecursive(String s1, String s2, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcsRecursive(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcsRecursive(s1, s2, m - 1, n), lcsRecursive(s1, s2, m, n - 1));
        }
    }


}
