public class DAY228_deleteAlternateNodes {

    public void deleteAlt(Node head) {

        int count = 0;
        Node prev = head;

        while (head != null) {
            count++;
            if (count % 2 == 0) {
                prev.next = head.next;
            }
            prev = head;
            head = head.next;
        }
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}