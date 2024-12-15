import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DAY292_eleKof2Arrays {

    public int kthElement(int a[], int b[], int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i : a)
            arr.add(i);
        for (int i : b)
            arr.add(i);
        Collections.sort(arr);
        return arr.get(k - 1);
    }

}
