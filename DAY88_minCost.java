public class DAY88_minCost {
    public static void main(String[] args) {

    }

    static int lcs(String x, String y, int cx, int cy) {
        int dp[][] = new int[x.length() + 1][y.length() + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    static int findMinCost(String x, String y, int costX, int costY) {

        int min = lcs(x, y, costX, costY);
        int xleft = (x.length() - min) * costX;
        int yleft = (y.length() - min) * costY;

        return xleft + yleft;
    }
}
