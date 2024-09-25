public class DAY210_pallindromeLL {
    boolean isPalindrome(Node head) {
        String str = "";
        String reverse = "";
        while (head != null) {
            str += head.data;
            reverse = head.data + reverse;
            head = head.next;
        }
        return str.equals(reverse);
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