import java.util.Arrays;

public class DAY166_sumOfMidEleTwoSortedArr {
    public int sumOfMidEle(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int sum = 0;

        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[ind] = arr1[i];
            ind++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[ind] = arr2[i];
            ind++;
        }

        Arrays.sort(arr);

        int m1 = arr.length / 2 - 1;
        int m2 = arr.length / 2;

        sum += arr[m1] + arr[m2];

        return sum;
    }
}
