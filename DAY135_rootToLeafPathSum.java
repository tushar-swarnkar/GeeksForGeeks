public class DAY135_rootToLeafPathSum {

    boolean hasPathSum(Node root, int target) {

        if (root == null) {
            return false;
        }

        int sum = target - root.data;

        if (root.left == null && root.right == null) {
            return (root.data == target);
        }

        boolean l = hasPathSum(root.left, sum);
        boolean r = hasPathSum(root.right, sum);

        return l || r;
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
