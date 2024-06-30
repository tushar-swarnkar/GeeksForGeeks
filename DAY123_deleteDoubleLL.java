public class DAY123_deleteDoubleLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    public Node deleteNode(Node head, int x) {
        if (x == 1) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
            head.prev = null;
        } else {
            Node curr = head;
            Node pre = null;

            int count = 1;
            while (count <= x - 1) {
                pre = curr;
                curr = curr.next;
                count++;
            }
            pre.next = curr.next;
            if (curr.next == null) {
                return head;
            }
            curr.next.prev = pre;
        }
        return head;
    }
}
