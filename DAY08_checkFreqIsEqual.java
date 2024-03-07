public class DAY08_checkFreqIsEqual {
    public static void main(String[] args) {
        String s = "xyyz";

        System.out.println(sameFreq(s));
    }

    static boolean sameFreq(String s) {
        int[] hash = new int[26];
        int minFreq = s.length();
        boolean flag = false;
        
        for(char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        for(int i=0; i<26; i++) {
            if(hash[i] == 0) continue;
            minFreq = Math.min(minFreq, hash[i]);
        }
        
        for(int i=0; i<26; i++) {
            if(hash[i] == 0 || hash[i] == minFreq) continue;
            if(flag || hash[i]-minFreq > 1) return false;
            flag = true;
        }
        
        return true;

    }
}