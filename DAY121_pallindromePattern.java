public class DAY121_pallindromePattern {
    public String pattern(int[][] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
                sb.append("-");
            }
            if (isPalindrome(sb.toString())) {
                return i + " R";
            }
            sb.setLength(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[j][i]);
                sb.append("-");
            }
            if (isPalindrome(sb.toString())) {
                return i + " C";
            }
            sb.setLength(0);
        }
        return "-1";
    }

    boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 2;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
