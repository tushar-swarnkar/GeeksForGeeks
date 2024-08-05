import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DAY159_bottonViewBT {
    public ArrayList<Integer> bottomView(Node root) {

        Queue<Pair> que = new LinkedList<Pair>();
        que.add(new Pair(root, 0));

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int min = 0;
        int max = 0;
        while (!que.isEmpty()) {
            Pair p = que.remove();

            map.put(p.pos, p.node.data);
            if (p.node.left != null) {
                que.add(new Pair(p.node.left, p.pos - 1));
                min = Math.min(min, p.pos - 1);
            }
            if (p.node.right != null) {
                que.add(new Pair(p.node.right, p.pos + 1));
                max = Math.max(max, p.pos + 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }
}

class Pair {
    Node node;
    int pos;

    Pair(Node node, int pos) {
        this.node = node;
        this.pos = pos;
    }
}