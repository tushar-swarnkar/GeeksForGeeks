public class DAY167_squareRootOfNum {
    long squareRoot (long n) {
        long h = n;
        long l = 0;
        long ans = 0;

        while (l <= h) {
            long mid = (h+l) / 2;
            if (mid * mid <= n) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return ans;
    }
}