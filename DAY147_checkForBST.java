public class DAY147_checkForBST {
    static int maxval(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int value = root.data;
        int leftmax = maxval(root.left);
        int rightmax = maxval(root.right);

        return Math.max(value, Math.max(leftmax, rightmax));
    }

    static int minval(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int value = root.data;
        int leftmin = minval(root.left);
        int rightmin = minval(root.right);

        return Math.min(value, Math.min(leftmin, rightmin));
    }

    static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data < min || root.data > max) {
            return false;
        }

        return isBSTUtil(root.left, min, root.data - 1) &&
                isBSTUtil(root.right, root.data + 1, max);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node (int data) {
        this.data = data;
        left = null;
        right = null;
    }
}