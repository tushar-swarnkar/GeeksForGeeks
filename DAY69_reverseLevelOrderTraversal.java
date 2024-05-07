import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DAY69_reverseLevelOrderTraversal {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> reverseLevelOrder(Node node) {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                Node curr = q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                l.add(curr.data);
            }
            Collections.reverse(l);
            list.addAll(l);
        }
        Collections.reverse(list);
        return list;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
}
