import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

public class DAY127_duplicateSubTrees {
    // Helper function to serialize a subtree
    private String serialize(Node root, Map<String, Integer> map, List<Node> res) {
        if (root == null)
            return "#";

        String serial = root.data + "," + serialize(root.left, map, res) + "," + serialize(root.right, map, res);

        map.put(serial, map.getOrDefault(serial, 0) + 1);

        if (map.get(serial) == 2)
            res.add(root); // Add subtree root to result list only the first time we encounter a duplicate

        return serial;
    }

    public List<Node> printAllDups(Node root) {
        List<Node> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        serialize(root, map, res);

        return res;
    }
}
