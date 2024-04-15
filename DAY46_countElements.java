import java.util.Arrays;

public class DAY46_countElements {
    public static void main(String[] args) {
        int a[] = {4,1,2};
        int b[] = {1,7,3};
        int n = 3;
        int query[] = {0,1};
        int q = 2;

        System.out.println(Arrays.toString (countElements(a, b, n, query, q)));
    }

    static int[] countElements(int a[], int b[], int n, int query[], int q) {
        int[] ans = new int[q];
        int max = a[0];
        for (int x : a) {
            max = Math.max(max, x);
        }
        int[] hash = new int[max + 1];
        for (int x : b) {
            if (x <= max) {
                hash[x]++;
            }
        }
        // prefix sum
        for (int i = 1; i <= max; i++) {
            hash[i] += hash[i - 1];
        }
        for (int i = 0; i < q; i++) {
            ans[i] = hash[a[query[i]]];
        }
        return ans;
    }
}
