import java.util.Arrays;

public class DAY273_smallestPositiveMissingNum {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] == count) {
                    count++;
                }
            }
        }

        return count;
    }
}
