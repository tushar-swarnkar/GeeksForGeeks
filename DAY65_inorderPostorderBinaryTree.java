import java.util.HashMap;

public class DAY65_inorderPostorderBinaryTree {
    public static void main(String[] args) {
        
    }
    static Node tree(int is, int ie, int in[], int ps, int pe, int post[], HashMap<Integer, Integer> mp) 
    {
        if(is > ie || ps > pe)
            return null;
            
        Node root = new Node(post[pe]);
        int inroot = mp.get(root.data);
        int numsLeft = inroot - is;
        
        root.left = tree(is, inroot - 1, in, ps, ps + numsLeft - 1, post, mp);
        root.right = tree(inroot + 1, ie, in, ps + numsLeft, pe - 1, post, mp);
        
        return root;
    }

    static Node buildTree(int in[], int post[], int n)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++)
            mp.put(in[i], i);
        
        return tree(0, n - 1, in, 0, n - 1, post, mp);
    }
    static class Node
    {
        int data;
        Node left;
        Node right;
    
            Node(int value)
        {
            data = value;
            left = null;
            right = null;
        }
    }
}
