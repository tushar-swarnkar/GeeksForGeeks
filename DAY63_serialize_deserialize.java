import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class DAY63_serialize_deserialize {
    public static void main(String[] args) {

    }

    static class Tree{
        int data;
        Tree left,right;
        Tree(int d){
            data=d;
            left=right=null;
        }
    }

    static ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> level = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n-- > 0) {
                Node p = q.remove();

                if (p == null) {
                    level.add(-1);
                    continue;
                }

                level.add(p.data);
                q.add(p.left);
                q.add(p.right);
            }
        }

        return level;
    }

    static Node deSerialize(ArrayList<Integer> a) {
        Node root = new Node(a.get(0));
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < a.size()) {
            Node p = q.remove();

            if (a.get(i) == -1)
                p.left = null;
            else {
                p.left = new Node(a.get(i));
                q.add(p.left);
            }

            i++;

            if (a.get(i) == -1)
                p.right = null;
            else {
                p.right = new Node(a.get(i));
                q.add(p.right);
            }

            i++;
        }

        return root;
    }

}
