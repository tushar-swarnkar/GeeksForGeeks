import java.util.HashMap;

public class DAY302_countPairs {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            if (map.containsKey(target - i)) {
                count += map.get(target - i);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }

}
