import java.util.ArrayList;

public class DAY153_ratInAMaze {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        int v[][] = new int[mat.length][mat.length];
        findPath(mat, v, 0, 0, ans, "", mat.length);
        return ans;
    }

    public void findPath(int mat[][], int v[][], int i, int j, ArrayList<String> ans, String s, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n || v[i][j] == 1 || mat[i][j] == 0) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            ans.add(s);
            return;
        }
        v[i][j] = 1;
        findPath(mat, v, i + 1, j, ans, s + "D", n);
        findPath(mat, v, i - 1, j, ans, s + "U", n);
        findPath(mat, v, i, j + 1, ans, s + "R", n);
        findPath(mat, v, i, j - 1, ans, s + "L", n);
        v[i][j] = 0;

    }
}
