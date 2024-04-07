import java.util.Arrays;

public class DAY38_maxDotProduct {
    public static void main(String[] args) {
        int n = 5; 
        int a[] = {2, 3, 1, 7, 8};
        int m = 3; 
        int b[] = {3, 6, 7};

        System.out.println(maxDotProduct(n, m, a, b));
    }

    static int maxDotProduct(int n, int m, int a[], int b[]) {
        // Your code goes here
        int[][] dp = new int[n][m];
        for (int[] dr : dp)
            Arrays.fill(dr, -1);
        return solve(n - 1, m - 1, a, b, n - m, dp);
    }

    static int solve(int i, int j, int[] a, int[] b, int gap, int[][] dp) {
        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int take = a[i] * b[j] + solve(i - 1, j - 1, a, b, gap, dp);
        int not_take = Integer.MIN_VALUE;
        if (gap > 0)
            not_take = solve(i - 1, j, a, b, gap - 1, dp);
        return dp[i][j] = Math.max(take, not_take);
    }
}