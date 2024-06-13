public class DAY106_PadovanSequence {
    public int padovanSequence(int n) {
        if (n <= 2)
            return 1;
        int a = 1;
        int b = 1;
        int c = 1;
        int mod = 1000000007;
        int tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = (a + b) % mod;
            a = b;
            b = c;
            c = tmp;
        }

        // System.out.println(c);
        return c;

    }
}
