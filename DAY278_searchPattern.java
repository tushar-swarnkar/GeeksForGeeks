import java.util.ArrayList;

public class DAY278_searchPattern {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> indices = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (m == j) {
                indices.add(i);
            }
        }
        return indices;
    }
}
