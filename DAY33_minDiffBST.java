import java.util.Stack;

public class DAY33_minDiffBST {
    public static void main(String[] args) {

    }

    static int absolute_diff(Node root) {
        // Your code here
        int output = Integer.MAX_VALUE;
        Stack<Node> stack = new Stack<Node>();
        Node previous = null, node = root;

        while (true) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (stack.isEmpty())
                break;

            Node current = stack.pop();
            if (previous != null)
                output = (int) Math.min(output, current.data - previous.data);

            previous = current;

            node = current.right;
        }

        return output;
    }

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
