public class DAY30_minValueInBST {
    public static void main(String[] args) {
        
    }
    static int minValue(Node root) {
        // code here
        return (root.left == null) ? root.data : minValue (root.left);
    }
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
