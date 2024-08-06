public class DAY160_validateIPAdress {
    public boolean isValid(String str) {

        String[] arr = str.split("\\.");

        if (arr.length != 4) {
            return false;
        }

        for (String part : arr) {
            if (part.isEmpty() || !part.matches("\\d+")) {
                return false;
            }

            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }

        return true;
    }
}
