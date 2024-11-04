import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAY250_findAllTriplets {

    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                int sum = (arr[i] + arr[j]) * -1;

                if (map.containsKey(sum)) {
                    for (int k : map.get(sum)) {
                        List<Integer> ans = new ArrayList<>(Arrays.asList(i, j, k));
                        Collections.sort(ans);
                        answer.add(ans);
                    }
                }
                map.putIfAbsent(arr[j], new ArrayList<>());
                map.get(arr[j]).add(j);
            }
        }

        return answer;
    }

}
