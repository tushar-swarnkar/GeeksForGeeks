import java.util.HashSet;

public class DAY10_removeDuplicate {
    public static void main(String[] args) {
        String str = "geEksforGEeks";

        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str) {
        String s = "";
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hs.contains(str.charAt(i))) {
                hs.add(str.charAt(i));
                s += str.charAt(i);
            }
        }
        return s;
    }
}
