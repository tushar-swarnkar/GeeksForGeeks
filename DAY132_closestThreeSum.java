import java.util.Arrays;

public class DAY132_closestThreeSum {
    static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int cSum = Integer.MAX_VALUE;
        int cDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                if (diff < cDiff || diff == cDiff && sum > cSum) {
                    cDiff = diff;
                    cSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return cSum;
    }
}
