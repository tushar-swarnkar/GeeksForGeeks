public class DAY05_maxIndex {
    public static void main(String[] args) {
        int n = 9;
        int a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        System.out.println(maxIndexDiff(a, n));
    }
    static int maxIndexDiff(int a[], int n) { 
        // Your code here
        int m = 0;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (a[i] <= a[j]) {
                m = Math.max(m, j-i);
                i++;
                j = n - 1;
            } else {
                j--;
            }
        }
        return m;
    }
}
