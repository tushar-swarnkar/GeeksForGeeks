public class DAY249_isLenghEvenLl {
    public boolean isLengthEven(Node head) {
        int count = 0;
        Node size = head;
        while (size != null) {
            size = size.next;
            count++;
        }
        return count % 2 == 0;
    }
}
