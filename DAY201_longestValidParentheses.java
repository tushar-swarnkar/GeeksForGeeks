public class DAY201_longestValidParentheses {
    static int maxLength(String S) {
        int len = S.length();
        int max = 0, op = 0, cl = 0, max2 = 0;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '(')
                op++;
            else
                cl++;
            if (cl > op) {
                op = 0;
                cl = 0;
            } else if (op == cl)
                max = Math.max(max, op * 2);
        }
        op = 0;
        cl = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (S.charAt(i) == '(')
                op++;
            else
                cl++;
            if (op > cl) {
                op = 0;
                cl = 0;
            } else if (op == cl)
                max2 = Math.max(max2, op * 2);
        }
        return Math.max(max, max2);
    }
}
