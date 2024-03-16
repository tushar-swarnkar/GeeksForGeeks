public class DAY16_deleteWithouHeadPointer {
    public static void main(String[] args) {
        // Linked List = 1 -> 2
        // del_node = 1
    }
    static void deleteNode(Node del_node) {
        // Your code here
        del_node.data = del_node.next.data;
        del_node.next = del_node.next.next;
    }
    static class Node {
        int data ;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
