public class DAY188_minNoOfDeletionInsertions {
    public int minOperations(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();

        int lcsLength = lcs(str1, str2, len1, len2);

        int deletions = len1 - lcsLength;
        int insertions = len2 - lcsLength;

        return deletions + insertions;
    }

    private int lcs(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
