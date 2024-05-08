import java.util.ArrayList;

public class DAY70_rootToLeaf {
    public static void main(String[] args) {
        
    }
    static void helper (Node root ,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp){
        if(root == null) return;
        if(root.left == null && root.right == null){
            temp.add(root.data);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.data);
        helper(root.left,ans,temp);
        helper(root.right,ans,temp);
        temp.remove(temp.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(root,ans,temp);
        return ans;
    }
    static class Node
    {
        int data;
        Node left;
        Node right;
    
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
