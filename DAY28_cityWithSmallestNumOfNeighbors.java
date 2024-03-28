import java.util.Arrays;

public class DAY28_cityWithSmallestNumOfNeighbors {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] edges = {{0, 1, 3},
                         {1, 2, 1},
                         {1, 3, 4},
                         {2, 3, 1}};
        int thresh = 4;

        System.out.println(findCity(n, m, edges, thresh));
    }

    static int findCity(int n, int m, int[][] edges, int thresh) {
        int[][] ma = new int[n][n];
        for (int[] r : ma) {
            Arrays.fill(r, 10001);
        }
        for (int i = 0; i < n; i++) {
            ma[i][i] = 0;
        }
        for (int[] it : edges) {
            ma[it[0]][it[1]] = ma[it[1]][it[0]] = it[2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ma[i][j] = Math.min(ma[i][j], ma[i][k] + ma[k][j]);
                }
            }
        }
        int ans = -1;
        int ne = n + 1;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (ma[i][j] <= thresh)
                    cnt++;
            }
            if (cnt <= ne) {
                ne = cnt;
                ans = i;
            }
        }
        return ans;

    }
}
