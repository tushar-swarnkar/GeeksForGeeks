public class DAY211_roofTop {
    public int maxStep(int arr[]) {
        int count = 0;
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
                if (count > ans) {
                    ans = count;
                }
            } else {
                count = 0;
            }

        }
        return ans;
    }
}
