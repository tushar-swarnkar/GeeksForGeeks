public class DAY100_maxOccuredInteger {
    public static void main(String[] args) {

    }

    static int maxOccured(int n, int l[], int r[], int maxx) {
        int a[] = new int[maxx + 2];

        for (int i = 0; i < n; i++) {
            a[l[i]]++;
            a[r[i] + 1]--;
        }

        for (int i = 1; i <= maxx; i++) {
            a[i] += a[i - 1];
        }

        int max = -1;
        int maxsum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxsum) {
                maxsum = a[i];
                max = i;
            }
        }
        return max;
    }
}
