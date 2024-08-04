import java.util.Arrays;

public class DAY158_nMeetingInOneRoom {
    public int maxMeetings(int n, int start[], int end[]) {
        int meetings[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        int count = 1;
        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);
        int endTime = meetings[0][1];

        for (int i = 1; i < n; i++) {
            if (endTime < meetings[i][0]) {
                count++;
                endTime = meetings[i][1];
            }
        }
        return count;
    }
}
