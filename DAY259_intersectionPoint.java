public class DAY259_intersectionPoint {

    int intersectPoint(Node head1, Node head2) {
        int len1 = head1 != null ? getLen(head1) : 0;
        int len2 = head2 != null ? getLen(head2) : 0;

        Node p1 = head1, p2 = head2;

        if (len1 > len2)
            for (int i = 0; i < len1 - len2; i++)
                p1 = p1.next;
        else
            for (int i = 0; i < len2 - len1; i++)
                p2 = p2.next;

        while (p1 != null && p2 != null) {
            if (p1 == p2)
                return p1.data;
            p1 = p1.next;
            p2 = p2.next;
        }

        return -1;
    }

    private static int getLen(Node node) {
        if (node == null)
            return 0;
        int len = 0;
        Node curr = node;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        return len;
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

class LinkedList {
    Node head;
}