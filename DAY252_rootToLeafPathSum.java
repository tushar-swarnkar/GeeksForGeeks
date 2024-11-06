class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class DAY252_rootToLeafPathSum {

    static int ans = 0;

    static void solve(Node root, int sum) {
        if (root == null)
            return;

        // Add current node's data to sum for the path
        sum = sum * 10 + root.data;

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            ans += sum;
            return;
        }

        // Recur for left and right subtree
        solve(root.left, sum);
        solve(root.right, sum);
    }

    public static int treePathsSum(Node root) {
        ans = 0; // Reset ans for each function call
        solve(root, 0);
        return ans;
    }

}
