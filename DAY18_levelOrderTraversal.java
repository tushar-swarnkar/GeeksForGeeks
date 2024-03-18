import java.util.ArrayDeque;
import java.util.ArrayList;

public class DAY18_levelOrderTraversal {
    public static void main(String[] args) {

    }
    static ArrayList <Integer> levelOrder(Node root) {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        ArrayDeque<Node> q=new ArrayDeque<>();
        q.addLast(root);
            
       //System.out.println(":"+q);
        while(q.size()!=0){
            
            Node node=q.pop();
            if(node.left!=null)
                q.add(node.left);
           if(node.right!=null)
                q.add(node.right);
           res.add(node.data);
        }
        
       return res;
    }
    static class Node {
        int data;
        Node right, left;

        Node (int item) {
            data = item;
            left = right = null;
        }
    }
}
