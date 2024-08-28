import java.util.Stack;

public class DAY181_maxDifference {
    public int findMaxDiff(int[] nums) {
        int[] lSE = new int[nums.length];
        int[] rSE = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            while (!stack.isEmpty() && nums[stack.peek()] > num) {
                rSE[stack.pop()] = num;
            }

            if (!stack.isEmpty()) {
                lSE[index] = (nums[stack.peek()] != num) ? nums[stack.peek()] : lSE[stack.peek()];
            }

            stack.push(index);
        }

        int maxDiff = 0;
        for (int index = 0; index < nums.length; index++) {
            maxDiff = Math.max(maxDiff, Math.abs(lSE[index] - rSE[index]));
        }

        return maxDiff;
    }
}
