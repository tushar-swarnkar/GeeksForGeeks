public class DAY300_rowWiseSort {

    public boolean searchRowMatrix(int[][] mat, int x) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x)
                    return true;
            }
        }
        return false;
    }

}