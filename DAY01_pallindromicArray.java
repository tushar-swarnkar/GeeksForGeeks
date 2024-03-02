public class DAY01_pallindromicArray {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555,};
        int n = 5;

        System.out.println(palinArray(arr, n));

    }
    public static int palinArray(int[] a, int n) {
        //add code here.
        for (int i = 0; i < n; i++) {
            if (!isPallindrom (a[i])) {
                return 0;
            }
        }
        return 1;
    }
    public static boolean isPallindrom (int num) {
        int reverse = 0;
        int orig = num;
        while (num > 0) {
            int dig = num % 10;
            reverse = reverse * 10 + dig;
            num /= 10;
        }
        return orig == reverse;
    }
}