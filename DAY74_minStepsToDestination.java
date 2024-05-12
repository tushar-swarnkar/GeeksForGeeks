public class DAY74_minStepsToDestination {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(minSteps(a));
    }
    static int minSteps(int d) {
        int cnt = 0;
        int i=0;
        while(i<d || (i-d)%2!=0){
            cnt++;
            i+=cnt;
        }
        return cnt;
    }
}
