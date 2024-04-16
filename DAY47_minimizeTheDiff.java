public class DAY47_minimizeTheDiff {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(minimizeDifference(n, k, arr));
    }

    static int minimizeDifference(int n, int k, int[] arr) {
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<=n-k;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(j<i || j>=i+k){
                    max=Math.max(max,arr[j]);
                    min=Math.min(min,arr[j]);
                }
            }
            ans=Math.min(ans,max-min);
        }

        return ans;
    }
}
