public class DAY37_waysToNthStair {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countWays(n));
    }
    static Long countWays(int n) {
        // your code here
        long count = 0;
        int copy = n;
        
        while (copy != 0 && copy !=1 ) {
            copy = copy - 2;
            count++;
        }
        
        return count + 1;
    }
}
