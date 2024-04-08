public class DAY39_optimalStrategy {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {5, 3, 7, 10};

        System.out.println(countMaximum(n, arr));
    }

    static long countMaximum(int n, int arr[]) {
        // Your code here
        int[][] dp = new int[n][n];

        for (int g = 0; g < n; g++) { // g means gap
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0)
                    dp[i][j] = arr[i];
                else if (g == 1)
                    dp[i][j] = Math.max(arr[i], arr[j]);
                else {
                    dp[i][j] = Math.max(arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]),
                            arr[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]));
                }
            }
        }

        return dp[0][n - 1];
    }
}
