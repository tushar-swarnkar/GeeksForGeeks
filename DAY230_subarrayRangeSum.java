import java.util.HashMap;
import java.util.Map;

public class DAY230_subarrayRangeSum {
    class Solution {

        static int subArraySum(int arr[], int tar) {

            Map<Integer, Integer> mm = new HashMap<>();
            int sum = 0, ans = 0;

            for (int x : arr) {
                sum += x;
                if (sum == tar)
                    ans++;
                if (mm.get(sum - tar) != null)
                    ans += mm.get(sum - tar);
                mm.put(sum, mm.getOrDefault(sum, 0) + 1);
            }
            
            return ans;
        }
    }
}
