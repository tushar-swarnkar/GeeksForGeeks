class Node {
    int val;
    Node next;
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class DAY164_rotateTheLinkedList {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        Node end = head;
        while (end.next != null) {
            end = end.next;
        }

        Node temp = head;
        Node prev = null;
        end.next = head;
        // until this point, it is a CIRCULAR LL

        int n = 0;
        while(n < k) {
            prev = temp;
            temp = temp.next;
            n++;
        }

        prev.next = null;
        return temp;
    }
}
