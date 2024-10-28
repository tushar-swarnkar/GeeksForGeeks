import java.util.ArrayList;
import java.util.HashSet;

public class DAY243_removeDuplicates {

    ArrayList<Integer> removeDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (set.contains(x)) {
                list.add(x);
                set.remove(x);
            }
        }
        return list;
    }

}
