public class DAY52_threeWayPartition {
    public static void main(String[] args) {
        int n = 5;
        int array[] = {1, 2, 3, 3, 4};
        int a = 1, b = 2;

        threeWayPartition(array, a, b);
    }
    static void threeWayPartition(int arr[], int a, int b) {
     
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high) {
            if(arr[mid] < a) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if(arr[mid] >= a && arr[mid] <= b) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
