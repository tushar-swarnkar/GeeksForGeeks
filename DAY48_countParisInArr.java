public class DAY48_countParisInArr {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {8, 4, 2, 1};

        System.out.println(countPairs(arr, n));
    }

    static int countPairs(int arr[], int n) {
        for (int i = 0; i < n; i++)
            arr[i] *= i;

        return mergeSort(arr, 0, n - 1);
    }

    static int merging(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, count = 0, k = 0, n = high - low + 1;
        int temp[] = new int[n];

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                count += mid - i + 1;
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= high)
            temp[k++] = arr[j++];

        for (i = 0, j = low; i < n; i++, j++)
            arr[j] = temp[i];

        return count;
    }

    static int mergeSort(int arr[], int low, int high) {
        int count = 0;

        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merging(arr, low, mid, high);
        }

        return count;
    }
}