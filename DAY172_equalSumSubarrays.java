public class DAY172_equalSumSubarrays {
    public boolean canSplit(int arr[]) {
        long sum = 0L;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0)
            return false;
        long sum1 = 0L;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            if (sum1 == sum / 2) {
                return true;
            }
        }
        return false;
    }
}

