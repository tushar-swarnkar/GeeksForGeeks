import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAY266_majorityElement {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length / 3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
