import java.util.HashSet;

public class DAY151_removeDuplicates {
    public String removeDups(String str) {
        // code here
        HashSet<Character> sri = new HashSet<>();

        String s = "";

        for (int i = 0; i < str.length(); i++) {
            sri.add(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (sri.contains(str.charAt(i))) {
                s += str.charAt(i);
                sri.remove(str.charAt(i));
            }
        }

        return s;
    }
}
