import java.util.ArrayList;
import java.util.Arrays;

public class DAY109_primePair {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here

        // Initialization of the prime array:
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // This loop implements the Sieve of Eratosthenes algorithm to mark non-prime
        // numbers.
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i)
                    prime[j] = false;
            }
        }

        // Finding the two prime numbers:
        for (int i = 2; i <= n; i++) {
            if (prime[i] && prime[n - i]) {
                ans.add(i);
                ans.add(n - i);
                return ans;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;

    }
}
