public class DAY07_longestRepSubStr {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = 9;

        System.out.println(longestSubstring(s, n));
    }
    static String longestSubstring(String S, int N) {
        // code here
        int max=0;
        String ans="-1";
        int i=0, j=0;
        while(i<N && j<N){
            String subString= S.substring(i, j+1);
            if(S.indexOf(subString, j+1)!=-1){
                int len= subString.length();
                if(len>max){
                    ans=subString;
                }
            }
            else{
                i++;
            }
            j++;
        }
        return ans;
    }
}
