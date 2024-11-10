import java.util.Arrays;

public class DAY255_minSum {

    String minSum(int[] arr) {
        // code here
        int c = 0;
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length - 1; i > 0; i -= 2) {
            sb.append(String.valueOf((c + arr[i] + arr[i - 1]) % 10));
            c = (c + arr[i] + arr[i - 1]) / 10;
        }
        if (arr.length % 2 != 0) {
            sb.append(String.valueOf((c + arr[0]) % 10));
            c = (c + arr[0]) / 10;
        }
        if (c != 0)
            sb.append(c);
        while (sb.charAt(sb.length() - 1) == '0')
            sb.deleteCharAt(sb.length() - 1);
        return sb.reverse().toString();

    }

}
