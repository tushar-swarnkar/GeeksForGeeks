import java.util.HashMap;
import java.util.Map;

public class DAY277_nonRepeatingChar {
    static char nonRepeatingChar(String S) {
        Map<Character, Integer> m = new HashMap();
        int n = S.length();
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (m.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}
