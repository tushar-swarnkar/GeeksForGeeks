import java.util.HashSet;
import java.util.Set;

public class DAY248_kthDistance {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        // processing initial window of size k+1
        for (int i = 0; i <= k; i++) {
            set.add(arr[i]);
        }

        if (set.size() <= k) {
            return true;
        }

        // now processing rest of the windows of size k+1
        for (int i = k + 1; i < arr.length; i++) {
            set.remove(arr[i - k - 1]); // removing out of window element
            set.add(arr[i]); // adding current window element
            if (set.size() <= k) {
                return true;
            }
        }
        return false;
    }

}
