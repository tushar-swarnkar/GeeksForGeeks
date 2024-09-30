import java.util.ArrayList;
import java.util.List;

public class DAY215_mergeTwoBST {
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root1, sortedList);
        inOrderTraversal(root2, sortedList);
        sortedList.sort(Integer::compareTo);
        return sortedList;
    }

    private void inOrderTraversal(Node root, List<Integer> sortedList) {
        if (root == null)
            return;
        inOrderTraversal(root.left, sortedList);
        sortedList.add(root.data);
        inOrderTraversal(root.right, sortedList);
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}