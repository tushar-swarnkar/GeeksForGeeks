public class DAY60_removeEveryKthNode {
    public static void main(String[] args) {

    }

    static Node delete(Node head, int k) {
        // Your code here
        if (k == 1) // i.e. every node will delete;
            return null;

        Node t = head; // for loop
        Node temp = head; // deleting node
        Node prev = temp; // preveios node
        int i = 0; // track node to delete

        while (t != null) {
            i++;
            t = t.next;
            if (i == k) {
                prev.next = temp.next;
                temp.next = null;
                temp = prev.next;
                i = 0;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    static class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
}
