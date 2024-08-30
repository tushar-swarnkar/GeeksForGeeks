public class DAY184_lengthOfLoops {
    public int countNodesinLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                int res = 0;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                do {
                    slow = slow.next;
                    res++;
                } while (slow != fast);
                return res;
            }
        }

        return 0;
    }
}
