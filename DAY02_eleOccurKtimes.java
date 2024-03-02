import java.util.HashMap;

public class DAY02_eleOccurKtimes {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        int[] arr = {1, 7, 4, 3, 4, 8, 7};

        System.out.println(firstElementKTime(n, k, arr));
    }

    static int firstElementKTime(int n, int k, int[] arr) { 
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++){
            
            Integer c = hmap.get(arr[i]);
            
            if(hmap.get(arr[i]) == null) {
                hmap.put(arr[i],1);
            }
            else{
                hmap.put(arr[i],++c);
                
                if(c==k){
                    return arr[i];
                }
            }
        }
        return -1;
    } 
}