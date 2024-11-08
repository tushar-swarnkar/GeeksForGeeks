import java.util.ArrayList;
import java.util.List;

public class DAY253_splitArray {
    public List<Integer> findSplit(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < n - 2; i++) {
            s += arr[i];
            int s1 = sum - s;
            int f = 0;
            for (int j = i + 1; j < n - 1; j++) {
                f += arr[j];
                int k = s1 - f;
                if (k == f && k == s) {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;

    }
}
