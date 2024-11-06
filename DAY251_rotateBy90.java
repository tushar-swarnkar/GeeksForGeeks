public class DAY251_rotateBy90 {

    static void rotate(int mat[][]) {
        int mod = 113;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int curr = mat[i][j] % mod;
                mat[j][n - i - 1] = (curr * mod) + mat[j][n - i - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = mat[i][j] / mod;
            }
        }
    }

}
