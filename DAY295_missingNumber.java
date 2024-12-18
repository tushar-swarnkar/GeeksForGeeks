public class DAY295_missingNumber {

    public int kthMissing(int[] arr, int k) {
        int si = 1, ei = arr.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] - mid <= k) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return k + si;
    }

}
