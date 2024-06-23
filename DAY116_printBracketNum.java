import java.util.ArrayList;

public class DAY116_printBracketNum {
    ArrayList<Integer> bracketNumbers(String str) {
        int n = str.length();
        int[] bracketNumber = new int[n];
        int counter = 1;
        int[] bracketpos = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                bracketNumber[i] = counter;
                bracketpos[index++] = counter;
                counter++;
            } else if (str.charAt(i) == ')') {
                bracketNumber[i] = bracketpos[--index];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (bracketNumber[i] > 0) {
                result.add(bracketNumber[i]);

            }
        }
        return result;
    }
}
