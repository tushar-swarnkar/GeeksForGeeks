public class DAY94_oddEvenProb {
    public static void main(String[] args) {

    }

    static String oddEven(String s) {
        int[] freq = new int[26];
        int x = 0, y = 0;

        for (char a : s.toCharArray())
            freq[a - 'a']++;

        for (int i = 0; i < 26; i++) {

            if (i % 2 == 0 && freq[i] % 2 == 1)
                x++;

            else if (i % 2 == 1 && freq[i] != 0 && freq[i] % 2 == 0)
                y++;
        }

        return (x + y) % 2 == 0 ? new String("EVEN") : new String("ODD");
    }
}
