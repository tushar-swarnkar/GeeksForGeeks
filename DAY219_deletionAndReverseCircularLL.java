public class DAY219_deletionAndReverseCircularLL {

    Node reverse(Node head) {

        if (head == null || head.next == head)
            return null;

        Node pre = head;
        Node current = head.next;
        Node next;
        do {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        } while (head != current);
        head.next = pre;
        head = pre;
        return head;
    }

    Node deleteNode(Node last, int key) {
        // code here((
        if (last.data == key) {
            Node temp = last;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;

            return last.next;
        }

        Node pre = last;
        Node cur = last.next;

        do {
            if (cur.data == key) {
                pre.next = cur.next;
                return last;
            }
            pre = cur;
            cur = cur.next;
        } while (cur != last.next);

        return last;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}