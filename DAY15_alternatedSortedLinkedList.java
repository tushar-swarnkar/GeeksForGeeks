public class DAY15_alternatedSortedLinkedList {
    public static void main(String[] args) {
        
    }
    static Node sort(Node head){
        //your code here, return the head of the sorted list
        Node n1 = head;
        Node n2 = head.next;
        while(n2!=null){
            if(n1.data>n2.data){
                int t=n1.data;
                n1.data=n2.data;
                n2.data=t;
            } 
                n2=n2.next;
        if(n2==null){
                n1=n1.next;
                n2=n1.next;
            }
        }
        return head;
   }
    static class Node {
        int data;
        Node next;
    
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }       
}
