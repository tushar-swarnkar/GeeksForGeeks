public class DAY261_secondLargest {

    public int getSecondLargest(int[] arr) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

}
