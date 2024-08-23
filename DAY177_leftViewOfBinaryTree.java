import java.util.ArrayList;
import java.util.List;

public class DAY177_leftViewOfBinaryTree {

    void view(Node root, List<Integer> ans, int level) {
        if (root == null)
            return;
        if (ans.size() == level)
            ans.add(root.data);
        view(root.left, ans, level + 1);
        view(root.right, ans, level + 1);
    }

    ArrayList<Integer> leftView(Node root) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        view(root, ans, 0);
        return ans;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}