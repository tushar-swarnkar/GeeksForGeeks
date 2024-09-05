public class DAY190_missingNumber {

    int missingNumber(int n, int arr[]) {
        int sum = n * (n + 1) / 2;
        for (int i : arr)
            sum -= i;
        return sum;
    }
}
