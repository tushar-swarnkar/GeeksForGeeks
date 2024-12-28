import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DAY304_findAllTriplets {

    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int target = -arr[i] - arr[j];
                if (map.containsKey(target)) {
                    for (int num : map.get(target)) {
                        if (num > j) {
                            List<Integer> temp = Arrays.asList(i, j, num);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;

    }

}
