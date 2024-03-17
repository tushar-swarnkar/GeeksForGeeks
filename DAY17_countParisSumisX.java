import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class DAY17_countParisSumisX {
    public static void main(String[] args) {
        
    }
    static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        HashSet<Integer> hs = new HashSet<>();
        
        int count = 0;
        
        Iterator<Integer> itr1 = head1.iterator();
        while (itr1.hasNext())
        {
            hs.add(itr1.next());    
            
        }
        
        Iterator<Integer> itr2 = head2.iterator();
        while (itr2.hasNext())
        {
            if(hs.contains(x - itr2.next())){
                count++;
            } 
            
        }
    
        return count;
    }
    static class Node {
        int data;
        Node next;
    
        Node(int key) {
            data = key;
            next = null;
        }
    }
}
