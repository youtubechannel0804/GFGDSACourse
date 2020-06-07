package dynamicprogramming;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "cut";
        String s2 = "cat";

        System.out.println(editDistanceRecursive(s1, s2, s1.length(), s2.length()));
        System.out.println(editDistanceDp(s1, s2, s1.length(), s2.length()));

        System.out.println(editDistanceRecursive("SATURDAY", "SUNDAY", s1.length(), s2.length()));
        System.out.println(editDistanceDp("SATURDAY", "SUNDAY", s1.length(), s2.length()));
    }

    private static int editDistanceDp(String s1, String s2, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    dp[i][j] = j;
                else if (j == 0)
                    dp[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }

        return dp[m][n];
    }

    private static int editDistanceRecursive(String s1, String s2, int m, int n) {

        if (n == 0)
            return m;
        else if (m == 0)
            return n;

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return editDistanceRecursive(s1, s2, m - 1, n - 1);
        } else {
            return 1 + Math.min(
                    Math.min(editDistanceRecursive(s1, s2, m - 1, n), editDistanceRecursive(s1, s2, m, n - 1))
                    , editDistanceRecursive(s1, s2, m - 1, n - 1));
        }


    }
}
