
public class DAY118_rotateMatrix {

    int[][] rotateMatrix(int k, int mat[][]) {

        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];
        int i, j;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                ans[i][j] = mat[i][(j + k) % n];
            }
        }

        return ans;
    }
}
