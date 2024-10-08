import java.util.Arrays;

public class DAY223_largestPairSum {
    public static int pairsum(int[] arr) {

        Arrays.sort(arr);

        int l1 = arr[arr.length - 1];
        int l2 = arr[arr.length - 2];

        int sum = l1 + l2;

        return sum;

    }
}
