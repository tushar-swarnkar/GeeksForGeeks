import java.util.ArrayList;

public class DAY64_distanceFromRoot {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int h = 0;
        Ktree(root, k, h, ans);
        return ans;
    }

    static void Ktree(Node root, int k, int h, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (h == k) {
            ans.add(root.data);
            return;
        }

        h++;
        Ktree(root.left, k, h, ans);
        Ktree(root.right, k, h, ans);
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
