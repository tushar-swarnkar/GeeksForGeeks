import java.util.PriorityQueue;

public class DAY260_nearlySorted {

    public void nearlySorted(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                arr[ind++] = pq.peek();
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            arr[ind++] = pq.peek();
            pq.poll();
        }
    }

}
