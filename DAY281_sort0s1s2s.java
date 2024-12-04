public class DAY281_sort0s1s2s {
    public void sort012(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int in = 0;

        while (i <= j) {
            if (arr[i] == 0) {
                int t = arr[in];
                arr[in++] = 0;
                arr[i++] = t;
            } else if (arr[i] == 2) {
                int t = arr[j];
                arr[j--] = 2;
                arr[i] = t;
            } else {
                i++;
            }
        }
    }
}
