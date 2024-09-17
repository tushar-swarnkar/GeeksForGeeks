import java.util.Arrays;

public class DAY202_minimizeHeight {
    int getMinDiff(int[] arr, int k) {

        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[0] + k, arr[i] - k);
                res = Math.min(res, max - min);

            } else
                continue;
        }
        return res;
    }

}
