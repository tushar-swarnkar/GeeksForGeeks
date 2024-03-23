import java.util.Arrays;

public class DAY23_fibonacciSeries {
    public static void main(String[] args) {
        int n = 336;
        System.out.println(Arrays.toString (series(n)));
    }

    static int[] series (int n ) {
        int[] ans = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            ans[i] = helper (i, ans);
        }
        return ans;
    }

    static int mod = 1000000007;
    static int helper (int n, int[] arr) {
        if (n < 2) {
            return n;
        }

        if (arr[n] != 0) {
            return arr[n];
        }

        int ans = (helper(n-1, arr) + helper(n-2, arr)) % mod;

        arr[n] = ans;
        return ans;
    }
}
