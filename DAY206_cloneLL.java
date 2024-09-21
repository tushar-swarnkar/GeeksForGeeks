public class DAY206_cloneLL {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        if (head == null)
            return null;
        Node curr = head;
        // new nodes next to the original nodes
        while (curr != null) {
            Node p = new Node(curr.data);
            p.next = curr.next;
            curr.next = p;
            curr = p.next;
        }
        // set random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        // separate original and cloned nodes
        Node clonedHead = head.next;
        curr = head;
        Node clone = clonedHead;
        while (clone.next != null) {
            curr.next = curr.next.next;
            clone.next = clone.next.next;

            curr = curr.next;
            clone = clone.next;
        }
        curr.next = null;
        clone.next = null;

        return clonedHead;

    }
}

class Node {
    int data;
    Node next, random;

    Node(int d) {
        data = d;
        next = random = null;

    }
}