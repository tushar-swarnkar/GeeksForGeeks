public class DAY229_countLinkedListNodes {

    public int getCount(Node head) {

        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
