import java.util.Arrays;

public class DAY57_exitPointMatrix {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matrix = {{0, 1, 0}, {0, 1, 1}, {0, 0, 0}};

        System.out.println(Arrays.toString (FindExitPoint(n, m, matrix)));
    }

    static int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        int dir = 1;
        int i = 0, j = 0;
        int[] ans = new int[2];
        while (i >= 0 && i < n && j >= 0 && j < m) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dir = (dir % 4) + 1;
            }
            if (dir == 1) {
                j++;
            } else if (dir == 2) {
                i++;
            } else if (dir == 3) {
                j--;
            } else {
                i--;
            }
        }
        // fixing the final answer
        if (dir == 1) {
            j--;
        } else if (dir == 2) {
            i--;
        } else if (dir == 3) {
            j++;
        } else {
            i++;
        }

        ans[0] = i;
        ans[1] = j;
        return ans;
    }
}
