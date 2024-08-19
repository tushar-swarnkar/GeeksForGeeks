public class DAY173_kthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int max = 0;
        for (int a : arr) {
            max = Math.max(max, a);
        }
        boolean[] nums = new boolean[max + 1];
        for (int a : arr) {
            nums[a] = true;
        }
        for (int i = 1; i <= max; i++) {
            if (nums[i]) {
                k--;
            }
            if (k == 0) {
                return i;
            }
        }
        return -1;
    }

}
