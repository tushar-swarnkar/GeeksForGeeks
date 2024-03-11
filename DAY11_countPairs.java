public class DAY11_countPairs {
    public static void main(String[] args) {
        int n = 3;
        int x = 21;

        int[][] mat1 = {{1, 5, 6},
        {8, 10, 11},
        {15, 16, 18}};

        int[][] mat2 = {{2, 4, 7},
        {9, 10, 12},
        {13, 16, 20}};

        System.out.println(countPairs(mat1, mat2, n, x));
    }

    static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int r1 = 0;
        int c1 = 0;
        int r2 = n - 1;
        int c2 = n - 1;
        int ans = 0;
        while(r1 < n && r2 >= 0){
            int sum = mat1[r1][c1] + mat2[r2][c2];
            if(sum <= x){
                if(sum == x){
                    ans++;
                }
                if(c1 < n - 1){
                    c1++;
                }
                else{
                    c1 = 0;
                    r1++;
                }
            }
            else if(sum > x){
                if(c2 > 0){
                    c2--;
                }
                else{
                    c2 = n - 1;
                    r2--;
                }
            }
        }
        return ans;
    }
}
