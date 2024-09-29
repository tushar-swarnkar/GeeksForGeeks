public class DAY214_totalCount {
    int totalCount(int k, int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += (arr[i] + k - 1) / k;
        }
        return c;
    }
}
