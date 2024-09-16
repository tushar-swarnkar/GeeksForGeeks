public class DAY200_BTtoDLL {

    Node head = null;
    Node prev = null;

    Node bToDLL(Node root) {
        // Your code here
        helper(root);
        return head;

    }

    private void helper(Node root) {
        if (root == null) {
            return;
        }

        helper(root.left);

        if (prev == null)
            head = root;

        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        helper(root.right);
    }

}

class Node {
    Node left, right;
    int data;

    Node(int d) {
        data = d;
        left = right = null;
    }

}