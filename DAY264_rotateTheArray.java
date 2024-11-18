public class DAY264_rotateTheArray {
    static void rotateArr(int arr[], int d) {
        d--;
        d = d % arr.length;
        reverse(arr, 0, d);
        reverse(arr, d + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            arr[i] += arr[j] - (arr[j] = arr[i]); // swap
            i++;
            j--;
        }
    }
}
