import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DAY198_alternatePositiveNegative {
    void rearrange(ArrayList<Integer> a) {
        Queue<Integer> p = new LinkedList<>();
        Queue<Integer> n = new LinkedList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 0)
                n.add(a.get(i));
            else
                p.add(a.get(i));
        }
        int i = 0;
        while (!p.isEmpty() && !n.isEmpty()) { 
            a.set(i++, p.poll());
            a.set(i++, n.poll());
        }
        while (!p.isEmpty()) {
            a.set(i++, p.poll());
        }
        while (!n.isEmpty()) {
            a.set(i++, n.poll());
        }

    }
}
