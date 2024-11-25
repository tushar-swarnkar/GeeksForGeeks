public class DAY271_maxProductSubarray {

    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int left = 1;
        int right = 1;
        int ans = arr[0];

        for (int i = 0; i < n; i++) {
            if (left == 0) {
                left = 1;
            }
            if (right == 0) {
                right = 1;
            }
            left *= arr[i];
            right *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(left, right));
        }
        return ans;
    }

}
