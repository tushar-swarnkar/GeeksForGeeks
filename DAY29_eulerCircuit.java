import java.util.ArrayList;

public class DAY29_eulerCircuit {
    public static void main(String[] args) {
        
    }
    static boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        for(int i=0;i<v;i++) 
           if(((adj.get(i).size())&1)!=0) return false;
       
       return true;
    }
}
