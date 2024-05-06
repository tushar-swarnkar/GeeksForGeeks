import java.util.ArrayList;
import java.util.Collections;

public class DAY68_nodesWithoutSiblings {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> toReturn = helper(list,node);
        if(toReturn.size()==0){
            toReturn.add(-1);
            return toReturn;
        }
        Collections.sort(toReturn);
        return toReturn;
    }
    static ArrayList<Integer> helper(ArrayList<Integer> list, Node root){
        if(root==null){
            return list;
        }
        if(root.left!=null && root.right==null){
            list.add(root.left.data);
        }
        if(root.left==null && root.right!=null){
            list.add(root.right.data);
        }
        helper(list,root.left);
        helper(list,root.right);
        
        return list;
    }
    static class Node
    {
        int data;
        Node left, right;
    
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
}
