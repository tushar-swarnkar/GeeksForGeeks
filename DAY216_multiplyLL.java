public class DAY216_multiplyLL {

    public long multiplyTwoLists(Node first, Node second) {
        long sum1 = 0;
        long sum2 = 0;
        int mod = 1000000007;
        while (first != null) {
            sum1 = (sum1 * 10 + first.data) % mod;
            first = first.next;
        }
        while (second != null) {
            sum2 = (sum2 * 10 + second.data) % mod;
            second = second.next;
        }
        return (sum1 * sum2) % mod;

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}