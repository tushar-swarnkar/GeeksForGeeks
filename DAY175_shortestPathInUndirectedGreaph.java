import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DAY175_shortestPathInUndirectedGreaph {

    public int[] shortestPath(int[][] edges, int n, int m, int src) {
        // Code here
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);

        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        q.add(src);
        ans[src] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adjList.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                    ans[v] = ans[u] + 1;
                }
            }
        }
        return ans;

    }

}
