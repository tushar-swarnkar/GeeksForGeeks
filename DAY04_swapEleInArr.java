import java.util.Arrays;

public class DAY04_swapEleInArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        swapEle(arr, n);
        System.out.println(Arrays.toString (arr));
    }
    static void swapEle (int[] arr, int n) {
        for (int i = 0; i < arr.length - 2; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
}
