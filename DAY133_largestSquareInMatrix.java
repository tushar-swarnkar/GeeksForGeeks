public class DAY133_largestSquareInMatrix {
    static int maxSquare(int n, int m, int mat[][]) {
        int[][] dp = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    if (mat[i][j] == 1) {
                        dp[i][j] = 1;
                    }
                } else {
                    if (mat[i][j] == 1) {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
