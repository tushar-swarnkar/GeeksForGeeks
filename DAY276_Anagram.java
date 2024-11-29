public class DAY276_Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        if (s1.length() != s2.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < (s1.length()); i++) {
            j = (int) (s1.charAt(i)) - 97;
            freq1[j]++;

            j = (int) (s2.charAt(i)) - 97;
            freq2[j]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
