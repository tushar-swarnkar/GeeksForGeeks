import java.util.Arrays;

public class DAY92_stringSubsequence {
    public static void main(String[] args) {

    }

    static int mod = (int) Math.pow(10, 9) + 7;

    static int match(int ind1, int ind2, String s1, String s2, int dp[][]) {
        if (ind2 < 0)
            return 1;
        if (ind1 < 0)
            return 0;

        if (dp[ind1][ind2] != -1)
            return dp[ind1][ind2] % mod;
        if (s1.charAt(ind1) == s2.charAt(ind2)) {
            return dp[ind1][ind2] = (match(ind1 - 1, ind2 - 1, s1, s2, dp) % mod
                    + match(ind1 - 1, ind2, s1, s2, dp) % mod) % mod;
        }

        return dp[ind1][ind2] = match(ind1 - 1, ind2, s1, s2, dp) % mod;

    }

    public static int countWays(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n][m];
        for (int arr[] : dp)
            Arrays.fill(arr, -1);
        return match(n - 1, m - 1, s1, s2, dp) % mod;
    }
}
