public class DAY126_removeAllOccurrenceOfDuplicatesLL {
    public Node removeAllDuplicates(Node head) {
        Node result = null;
        Node curr = null;
        int removingData = -1;

        while (head != null) {
            if (head.next != null && head.data == head.next.data) {
                removingData = head.data;
            } else {
                if (head.data != removingData) {
                    if (curr == null) {
                        curr = head;
                        result = curr;
                    } else {
                        curr.next = head;
                        curr = curr.next;
                    }
                }
            }
            head = head.next;
        }
        if (curr.next != null)
            curr.next = null;
        return result;
    }

}
