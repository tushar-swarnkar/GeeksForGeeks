import java.util.Arrays;

public class DAY254_minRepetitionForSubstring {

    static class hash {
        public long[] hash1, hash2;
        public long[] pow1, pow2;
        int base1 = 31, base2 = 47;
        long mod = 1000000007;

        hash(String s) {
            hash1 = new long[s.length() + 1];
            hash2 = new long[s.length() + 1];
            pow1 = new long[s.length() + 1];
            pow2 = new long[s.length() + 1];
            hash1[0] = hash2[0] = pow1[0] = pow2[0] = 1;

            for (int i = 0; i < s.length(); i++) {
                hash1[i + 1] = (hash1[i] * base1 + (s.charAt(i) - 'a' + 1)) % mod;
                hash2[i + 1] = (hash2[i] * base2 + (s.charAt(i) - 'a' + 1)) % mod;
                pow1[i + 1] = (pow1[i] * base1) % mod;
                pow2[i + 1] = (pow2[i] * base2) % mod;
            }
        }

        public long[] get(int l, int r) {
            l++;
            r++;
            long v1 = (hash1[r] - (hash1[l - 1] * pow1[r - l + 1]) % mod + mod) % mod;
            long v2 = (hash2[r] - (hash2[l - 1] * pow2[r - l + 1]) % mod + mod) % mod;

            return new long[] { v1, v2 };
        }
    }

    static int minRepeats(String s1, String s2) {
        // code here
        StringBuilder t = new StringBuilder();
        int curr = 0;
        while (t.length() < s2.length()) {
            t.append(s1);
            curr++;
        }
        int n = t.length();
        hash a = new hash(t.toString());
        hash b = new hash(s2);
        int m = s2.length();

        for (int i = 0; i < n; i++) {
            int x = i;
            int y = i + m - 1;

            if (y >= n) {
                int len = (n - 1) - x + 1;
                int rem = m - len;
                boolean p = Arrays.equals(a.get(x, n - 1), b.get(0, len - 1));
                boolean q = Arrays.equals(a.get(0, rem - 1), b.get(len, m - 1));
                if (p && q)
                    return curr + 1;
            } else {
                if (Arrays.equals(a.get(x, y), b.get(0, m - 1)))
                    return curr;
            }
        }
        return -1;
    }

}
