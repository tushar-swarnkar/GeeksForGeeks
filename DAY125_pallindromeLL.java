
public class DAY125_pallindromeLL {

    public boolean compute(Node root) {
        StringBuilder sb = new StringBuilder();
        Node temp = root;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}

class Node {
    String data;
    Node next;

    Node(String d) {
        d = data;
        next = null;
    }
}