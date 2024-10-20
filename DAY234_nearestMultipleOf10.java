public class DAY234_nearestMultipleOf10 {
    
    String roundToNearest(String str) {
        int n = str.length();
        int last = str.charAt(n - 1) - '0';

        char[] digit = str.toCharArray();

        if (last <= 5) {
            digit[n - 1] = '0';
        } else {
            digit[n - 1] = '0';
            boolean carry = true;

            for (int i = n - 2; i >= 0; i--) {
                if (digit[i] == '9')
                    digit[i] = '0';
                else {
                    digit[i] = (char) (digit[i] + 1);
                    carry = false;
                    break;
                }
            }
            if (carry)
                return '1' + new String(digit);
        }
        return new String(digit);
    }

}
