import java.util.ArrayList;

public class DAY194_sort012 {
    public void sort012(ArrayList<Integer> arr) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                count0++;
            } else if (arr.get(i) == 1) {
                count1++;
            } else if (arr.get(i) == 2) {
                count2++;
            }
        }
        arr.clear();
        for (int i = 0; i < count0; i++) {
            arr.add(0);
        }
        for (int i = 0; i < count1; i++) {
            arr.add(1);
        }
        for (int i = 0; i < count2; i++) {
            arr.add(2);
        }
    }
}
