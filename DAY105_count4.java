public class DAY105_count4 {
    public static int countNumberswith4(int n) {
        // code here
        int i, count = 0;
        for (i = 1; i <= n; i++) {
            String numberStr = Integer.toString(i);
            if (numberStr.contains("4"))
                count++;
        }
        return count;
    }
}
