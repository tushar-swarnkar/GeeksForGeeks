import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DAY182_sortingElementsByFrequency {
    public ArrayList<Integer> sortByFreq(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int val : arr) {
            ans.add(val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        Collections.sort(ans, (a, b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if (fa == fb)
                return a - b;
            else
                return fb - fa;
        });

        return ans;
    }
}
