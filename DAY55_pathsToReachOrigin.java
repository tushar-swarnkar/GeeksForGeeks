import java.util.Arrays;

public class DAY55_pathsToReachOrigin {
    public static void main(String[] args) {
        int x = 3, y = 0;

        System.out.println(ways(x, y));
    }

    static int MOD = 1000000007;

    static int ways(int x, int y) {
        // complete the function
        int[][] memo = new int[x + 1][y + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return countPaths(x, y, memo);
    }

    static int countPaths(int x, int y, int[][] memo) {
        if (x == 0 && y == 0)
            return 1;
        if (x < 0 || y < 0)
            return 0;
        if (memo[x][y] != -1)
            return memo[x][y];

        // Memoization
        memo[x][y] = (countPaths(x - 1, y, memo) + countPaths(x, y - 1, memo)) % MOD;

        return memo[x][y];
    }
}
