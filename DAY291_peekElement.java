public class DAY291_peekElement {
    public int peakElement(int[] arr) {
        int max = arr[0];
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
