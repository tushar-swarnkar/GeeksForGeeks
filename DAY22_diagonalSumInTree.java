import java.util.ArrayList;
import java.util.HashMap;

public class DAY22_diagonalSumInTree {
    public static void main(String[] args) {
        
    }
    static HashMap<Integer, Integer> map = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static int leftLevel = 0;
    
    public static ArrayList <Integer> diagonalSum(Node root) {
        // code here.
        if(root==null){
            return list;
        }
        map.clear();
        list.clear();
        leftLevel=0;
        calculateDiagonalSum(root);
        for(int i=0;i<map.size();i++){
            list.add(map.get(i));
        }
        
        return list;
    
    }
    public static void calculateDiagonalSum(Node root){
        if(root==null){
            return;
        }
            
        // leftLevel++;
        if (map.containsKey(leftLevel)) {
            int prev=map.get(leftLevel);
            prev=prev+root.data;
            map.put(leftLevel,prev);
        } else {
            map.put(leftLevel,root.data);
        }
            
        calculateDiagonalSum (root.right);
        leftLevel++;
        calculateDiagonalSum (root.left);
        leftLevel--;
    }

    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
}
