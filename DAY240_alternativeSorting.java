import java.util.ArrayList;
import java.util.Arrays;

public class DAY240_alternativeSorting {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (start != end) {
                result.add(arr[end--]);
                result.add(arr[start++]);
            } else {
                result.add(arr[start]);
                break;
            }
        }

        return result;
    }
}
