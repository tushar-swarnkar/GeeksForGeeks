public class DAY131_searchRotatedBS {
    int search(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[low] <= a[mid]) {
                if (a[low] <= key && key <= a[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (a[mid] <= key && key <= a[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
