public class DAY117_summedMatrix {
    static long sumMatrix(long n, long q) {
        long min_i = Math.max(1, q - n);
        long max_i = Math.min(n, q - 1);

        if (min_i > max_i) {
            return 0;
        }

        return max_i - min_i + 1;
    }
}
