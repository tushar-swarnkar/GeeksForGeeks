public class DAY09_findNthChar {
    public static void main(String[] args) {
        String s = "1100";
        int r = 2;
        int n = 3;

        System.out.println(nthCharacter(s, r, n));
    }
    static char nthCharacter(String S, int R, int N)
    {
        //code here
        for(;R>0;N%=1<<R--)
        S=S.charAt(N/(1<<R))=='0'?"01":"10";
        return S.charAt(N);
    }
}
