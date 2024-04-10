import java.util.ArrayList;
import java.util.HashMap;

public class DAY41_partyOfCouples {
    public static void main(String[] args) {
        int n = 11;
        int[] arr = {1, 2, 3, 2, 1};
        
        System.out.println(findSingle(n, arr));
    }
    static int findSingle(int n, int arr[]){
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey (arr[i])) {
                hm.remove(arr[i]);
            } else {
                hm.put (arr[i], 1);
            }
        }
        
        ArrayList<Integer> ar = new ArrayList<>(hm.keySet());
        
        return ar.get(0);
    }
}