public class DAY290_searchInRotatedSortedArr {

    int search(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return index;
    }

}
