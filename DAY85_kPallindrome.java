public class DAY85_kPallindrome {
    public static void main(String[] args) {

    }

    static int kPalindrome(String str, int n, int k) {
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            dp[i][i] = 0;
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] <= k ? 1 : 0;
    }
}
