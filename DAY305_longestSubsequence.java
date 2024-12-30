import java.util.Arrays;

public class DAY305_longestSubsequence {
    public int longestConsecutive(int[] nums) {

        int max = 1;
        int c = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                c++;
            } else if (nums[i] - nums[i - 1] == 0) {

            } else {
                c = 1;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}
