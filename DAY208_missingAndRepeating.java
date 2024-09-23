public class DAY208_missingAndRepeating {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        long sum = 0, sumOfSquares = 0;
        long expectedSum = n * (n + 1L) / 2;
        long expectedSumOfSquares = n * (n + 1L) * (2 * n + 1L) / 6;
        for (int num : arr) {
            sum += num;
            sumOfSquares += (long) num * num;
        }
        long sumDifference = expectedSum - sum;
        long squareSumDifference = expectedSumOfSquares - sumOfSquares;
        long sumOfAPlusB = squareSumDifference / sumDifference;
        int A = (int) (sumDifference + sumOfAPlusB) / 2;
        int B = (int) (sumOfAPlusB - A);
        return new int[] { B, A };
    }
}
