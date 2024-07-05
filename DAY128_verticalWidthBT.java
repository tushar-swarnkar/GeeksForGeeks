public class DAY128_verticalWidthBT {
    // Function to find the vertical width of a Binary Tree.
    int min = 0;
    int max = 0;

    public int verticalWidth(Node root) {
        // code here.
        if (root == null)
            return 0;
        helper(root, 0);
        return (max - min) + 1;
    }

    private void helper(Node root, int l) {
        if (root == null)
            return;
        min = Math.min(l, min);
        max = Math.max(max, l);
        helper(root.left, l - 1);
        helper(root.right, l + 1);
    }
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}