public class DAY129_populateInorderSuccessor {
    public void populateNext(Node root) {
        Node p = null; // pointer for tracking next node;
        while (root != null) {
            if (root.left == null) {
                if (p == null) {
                    p = root;
                } else {
                    p.next = root;
                    p = p.next;
                }
                root = root.right;
            } else {
                Node temp = root.left;
                while (temp.right != null && temp.right != root) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = root;
                    root = root.left;
                } else {
                    temp.right = null;
                    if (p == null) {
                        p = root;
                    } else {
                        p.next = root;
                        p = p.next;
                    }
                    root = root.right;
                }
            }
        }
    }
}

class Node {
    int data;
    Node left, right, next;

    public Node(int data) {
        this.data = data;
    }
}