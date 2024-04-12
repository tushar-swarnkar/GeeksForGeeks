public class DAY43_sumOfProducts {
    public static void main(String[] args) {
        int n = 3;
        long[] arr = {5, 10, 15};

        System.out.println(pairAndSum(n, arr));
    }
    static long pairAndSum(int n, long arr[]) {
        // code here
        long ans =0l;
        for(int i=0;i<64;i++){
            long bit = 1l<<i;
            long cnt=0;
            for(int j=0;j<n;j++){
                //calculating the total set bit at the given bit of the all numbers
                //in the array and then find the pair and will multiply the pair by the
                //int value of the given bit as it is contributing into the all the element
                if((arr[j]&bit)>0){
                    cnt++;
                }
            }
            ans += ((cnt*(cnt-1)/2) * (bit));
        }
        return ans;
    }
}
