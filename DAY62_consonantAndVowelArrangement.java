public class DAY62_consonantAndVowelArrangement {
    public static void main(String[] args) {
        
    }
    static Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        if(head == null)
           return head;
           
        Node cur = head;
        
        Node vow = new Node('\0');
        Node vow1 = vow;
        Node cons =new Node('\0');
        Node cons1 = cons;
        while(cur != null)
        {
            
            if(cur.data == 'a' || cur.data == 'e' || cur.data == 'i' || cur.data == 'o' || cur.data == 'u')
            {
                Node newNode = new Node(cur.data);
                vow1.next = newNode;
                 vow1 = newNode;
            }
            else
            {
                 Node newNode = new Node(cur.data);
                cons1.next = newNode;
               cons1 =   newNode ;
            }
            cur = cur.next;
        }
        vow1.next = cons.next;
        
        return vow.next;
    }
    static class Node {
        char data;
        Node next;
        
        public Node(char data){
            this.data = data;
            next = null;
        }
    }
}