import java.util.ArrayList;

public class DAY217_rotateAndDelete {

    public static int rotateDelete(ArrayList<Integer> arr) {
        int k = 1;
        while (arr.size() > 1) {
            clockwise(arr);

            int n = arr.size();
            int deleteIndex = n - k;

            if (deleteIndex >= 0) {
                arr.remove(deleteIndex);
            } else {
                arr.remove(0);
            }
            k++;
        }
        return arr.get(0);
    }

    public static void clockwise(ArrayList<Integer> arr) {

        int lastElement = arr.remove(arr.size() - 1);
        arr.add(0, lastElement);

    }

}