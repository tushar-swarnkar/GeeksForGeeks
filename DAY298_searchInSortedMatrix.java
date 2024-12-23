public class DAY298_searchInSortedMatrix {

    public boolean searchMatrix(int[][] mat, int x) {
        // code here
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
