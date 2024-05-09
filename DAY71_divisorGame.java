public class DAY71_divisorGame {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(divisorGame(n));
    }
    static boolean divisorGame(int n) {
        return n%2 == 0 ?true:false;
    }
}
