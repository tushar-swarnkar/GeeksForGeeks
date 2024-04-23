public class DAY54_RohansLoveForMatrix {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(firstElement(n));
    }
    static int firstElement(int n) {
        // code here
        int moc = 1000000007;
        if (n == 0 || n == 1) return 1;
        int c = 0;
        int a = 1, b = 1;
        for (int i = 0; i < n - 2; i++) {
            c = (a + b) % moc;
            a = b % moc;
            b = c % moc;
        }
        return c % moc;
    }
}
