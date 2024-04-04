public class DAY35_sumAllSubstr {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(sumSubstrings(s));
    }

    static long sumSubstrings(String s) {
        // Your code here
        int n = s.length(), mod = (int) 1e9 + 7;
        long dp[] = new long[n];

        dp[0] = s.charAt(0) - '0';
        long res = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = ((dp[i - 1] * 10) % mod + ((s.charAt(i) - '0') * (i + 1)) % mod) % mod;
            res = (res + dp[i]) % mod;
        }

        return res % mod;
    }
}
