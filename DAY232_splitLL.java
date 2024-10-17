public class DAY232_splitLL {
    Node[] alternatingSplitList(Node head) {

        if (head == null) {
            return new Node[] { null, null };
        }

        Node t1 = head;
        Node t2 = head.next;
        Node temp1 = t1;
        Node temp2 = t2;

        while (temp1 != null && temp2 != null && temp2.next != null && temp1.next != null) {
            temp1.next = temp1.next.next;
            temp2.next = temp2.next.next;

            temp1 = temp1.next;
            temp2 = temp2.next;

        }

        if (temp1 != null)
            temp1.next = null;

        return new Node[] { t1, t2 };

    }
}

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}