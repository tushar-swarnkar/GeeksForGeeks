import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DAY176_alienDictionary {
    public String findOrder(String[] dict, int n, int k) {
        // Write your code here
        // Step 1: Create an adjacency list for the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Build the graph by comparing adjacent words
        for (int i = 0; i < n - 1; i++) {
            String word1 = dict[i];
            String word2 = dict[i + 1];
            int len = Math.min(word1.length(), word2.length());
            for (int j = 0; j < len; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    adj.get(word1.charAt(j) - 'a').add(word2.charAt(j) - 'a');
                    break; // only the first different character matters
                }
            }
        }

        // Step 3: Perform topological sort (Kahn's algorithm)
        int[] inDegree = new int[k];
        for (int i = 0; i < k; i++) {
            for (int v : adj.get(i)) {
                inDegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        StringBuilder order = new StringBuilder();

        // Add nodes with 0 in-degree to the queue
        for (int i = 0; i < k; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }

        // BFS (Kahn's Algorithm)
        while (!q.isEmpty()) {
            int u = q.poll();
            order.append((char) (u + 'a'));

            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        // If the order has the same number of characters as k, it's valid
        if (order.length() == k) {
            return order.toString();
        }

        return "";
    }

}