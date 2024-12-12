import java.util.Arrays;

public class DAY287_mergeWithoutSpace {
    public void mergeArrays(int a[], int b[]) {
        int left = a.length - 1;
        int right = 0;
        while (left >= 0 && right < b.length) {
            if (a[left] > b[right]) {
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
