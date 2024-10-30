import java.util.HashMap;

public class DAY245_pairsWithDifferenceK {

    int countPairsWithDiffK(int[] arr, int k) {

        int diff = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int num = k + arr[i];
            if (map.containsKey(num)) {
                diff += map.get(num);
            }
        }
        return diff;

    }

}
