public class DAY191_KadaneAlgorithm {
    int maxSubarraySum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        int localSum = 0;

        for (int i = 0; i < arr.length; i++) {
            localSum += arr[i];

            if (localSum > maxSum) {
                maxSum = localSum;
            }

            if (localSum < 0) {
                localSum = 0;
            }
        }

        return maxSum;
    }
}
