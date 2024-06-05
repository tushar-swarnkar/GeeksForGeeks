import java.util.HashSet;

public class DAY98_makeSumEqual {
    public static void main(String[] args) {

    }

    long findSwapValues(long a[], int n, long b[], int m) {

        long sumA = 0;
        for (long num : a) {
            sumA += num;
        }

        long sumB = 0;
        for (long num : b) {
            sumB += num;
        }

        long diff = sumA - sumB;

        if (diff % 2 != 0) {
            return -1;
        }

        diff /= 2;

        HashSet<Long> setA = new HashSet<>();
        for (long num : a) {
            setA.add(num);
        }

        for (long num : b) {
            if (setA.contains(num + diff)) {
                return 1;
            }
        }

        return -1;
    }

}
