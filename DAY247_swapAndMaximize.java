import java.util.Arrays;

public class DAY247_swapAndMaximize {

    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        long sum = 0;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            sum += (Math.abs(arr[j] - arr[i++]) + Math.abs(arr[j--] - arr[i]));

        }
        sum += Math.abs(arr[i] - arr[0]);
        return sum;
    }

}
