import java.util.ArrayList;
import java.util.List;

public class DAY185_sortedSubsequenceSize3 {
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;

        int[] premin = new int[n];
        int[] suffmax = new int[n];
        premin[0] = arr[0];
        suffmax[n - 1] = arr[n - 1];

        for (int i = 1; i < arr.length - 1; i++) {
            premin[i] = Math.min(premin[i - 1], arr[i]);
        }

        for (int i = n - 2; i > 0; i--) {
            suffmax[i] = Math.max(suffmax[i + 1], arr[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (premin[i] < arr[i] && arr[i] < suffmax[i]) {
                list.add(premin[i]);
                list.add(arr[i]);
                list.add(suffmax[i]);
                break;
            }
        }

        return list;
    }
}
