public class DAY47_minimizeTheDiff {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(minimizeDifference(n, k, arr));
    }

    static int minimizeDifference(int n, int k, int[] arr) {
        int[] post_max=new int[n];
        int[] post_min=new int[n];
        post_max[n-1]=arr[n-1];
        post_min[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            post_max[i]=Math.max(post_max[i+1],arr[i]);
            post_min[i]=Math.min(post_min[i+1],arr[i]);
        }

        int ans=post_max[k]-post_min[k];
        int maxi=arr[0];
        int mini=arr[0];

        for(int i=1;i<n-k;i++){
            int diff=Math.max(maxi,post_max[i+k])-Math.min(mini,post_min[i+k]);
            ans=Math.min(ans,diff);
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        
        ans=Math.min(ans,maxi-mini);
        return ans;
    }
}
