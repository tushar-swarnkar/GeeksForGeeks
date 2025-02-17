import java.util.Arrays;

public class DAY293_aggressiveCows {

    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length; // size of array
        // sort the stalls[]:
        Arrays.sort(stalls);

        int low = 1, high = stalls[n - 1] - stalls[0];
        // apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k) == true) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return high;
    }

    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; // size of array
        int cntCows = 1; // no. of cows placed
        int last = stalls[0]; // position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; // place next cow.
                last = stalls[i]; // update the last location.
            }
            if (cntCows >= cows)
                return true;
        }
        return false;
    }

}
