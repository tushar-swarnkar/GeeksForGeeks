import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class DAY140_createBT {

    class Solution {
        // Function to construct binary tree from parent array.
        public Node createTree(int parent[]) {
            // Your code here
            int n = parent.length;
            Map<Integer, Node> map = new HashMap<>();

            Node root = null;

            for (int i = 0; i < n; i++) {
                map.put(i, new Node(i));

                if (parent[i] == -1) {
                    root = map.get(i);
                }
            }

            for (int i = 0; i < n; i++) {

                if (parent[i] != -1) {

                    Node parentnode = map.get(parent[i]);
                    Node childnode = map.get(i);

                    if (parentnode.left == null) {
                        parentnode.left = childnode;
                    } else {
                        parentnode.right = childnode;
                    }

                }
            }
            return root;
        }
    }
}
