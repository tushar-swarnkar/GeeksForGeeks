import java.util.ArrayList;

public class DAY130_ancestorsInBinaryTree {
    ArrayList<Integer> result = new ArrayList<Integer>();

    public ArrayList<Integer> Ancestors(Node root, int target) {
        solve(root, target);
        return result;
    }

    public boolean solve(Node root, int target) {
        if (root == null)
            return false;

        if (root.data == target)
            return true;

        boolean isAncestor = solve(root.left, target);
        if (!isAncestor)
            isAncestor = solve(root.right, target);

        if (isAncestor)
            result.add(root.data);

        return isAncestor;
    }
}

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}