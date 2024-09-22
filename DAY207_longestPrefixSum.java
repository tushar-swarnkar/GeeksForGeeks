public class DAY207_longestPrefixSum {

    int lps(String str) {

        int i = 1, j = 0, n = str.length();
        int storeLength[] = new int[n];
        while (i < n) {
            if (str.charAt(i) == str.charAt(j))
                storeLength[i++] = ++j;
            else if (j > 0)
                j = storeLength[j - 1];
            else
                i++;
        }
        return storeLength[n - 1];

    }
}
