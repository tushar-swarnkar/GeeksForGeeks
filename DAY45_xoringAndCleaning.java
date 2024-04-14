public class DAY45_xoringAndCleaning {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArr(n, arr);
        setToZero(n, arr);
        xor1ToN(n, arr);
    }
    static void printArr(int n, int arr[]) {
        // code here
        for (int i : arr) {
            System.out.print (i + " ");
        }
        System.out.println();
    }

    static void setToZero(int n, int arr[]) {
        // code here
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
    }

    static void xor1ToN(int n, int arr[]) {
        // code here
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] ^ i;
        }
    }
}
