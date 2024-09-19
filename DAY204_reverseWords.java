public class DAY204_reverseWords {
    String reverseWords(String s) {

        String res = new String("");

        String[] str = s.split("\\.");

        boolean flag = false;

        for (int i = str.length - 1; i >= 0; i--) {
            if (flag) {
                res += ".";
            }
            res += str[i];
            flag = true;
        }

        return res;

    }
}
