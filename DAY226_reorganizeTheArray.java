import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DAY226_reorganizeTheArray {
    public List<Integer> rearrange(List<Integer> arr) {

        Collections.sort(arr);
        List<Integer> output = new ArrayList<>(Collections.nCopies(arr.size(), -1));

        for (Integer num : arr) {
            if (num >= 0 && num < arr.size()) {
                output.set(num, num);
            }
        }

        return output;
    }
}
