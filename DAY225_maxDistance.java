import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAY225_maxDistance {

    public int maxDistance(int[] arr) {

        int maxValue = Integer.MIN_VALUE;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(i);
                map.put(arr[i], t);
            } else {
                ArrayList<Integer> t = map.get(arr[i]);
                t.add(i);
                map.put(arr[i], t);
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> t = entry.getValue();
            int largest = t.get(t.size() - 1) - t.get(0);
            maxValue = Math.max(largest, maxValue);
        }

        return maxValue;
    }
}