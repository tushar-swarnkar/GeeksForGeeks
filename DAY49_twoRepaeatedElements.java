import java.util.ArrayList;
import java.util.Arrays;

public class DAY49_twoRepaeatedElements {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1,2,1,3,4,3};

        System.out.println(Arrays.toString (twoRepeated(arr, n)));
    }

    static int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
     
        
        int[] count = new int[n+1];
        
        for(int i=0;i<arr.length;i++){
            if(count[arr[i]]>0){
                list.add(arr[i]);
            }
            else{
                count[arr[i]]++;
            }
        }
        
        int[] ans=new int[list.size()];
        int t=0;
        for(int a:list){
            ans[t]=a;
            t++;
        }
        
        return ans;
    }
}
