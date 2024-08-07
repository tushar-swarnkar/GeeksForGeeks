import java.util.Arrays;

public class DAY161_kthElementInTwoArrays {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int length = arr1.length + arr2.length;
        int[] arrs = new int[length];
        int i = 0;
        for (int m = 0; m < arr1.length; m++) {
            arrs[i] = arr1[m];
            i++;
        }
        for (int m = 0; m < arr2.length; m++) {
            arrs[i] = arr2[m];
            i++;
        }
        Arrays.sort(arrs);
        return arrs[k - 1];

    }
}
