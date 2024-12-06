import java.util.Arrays;

public class DAY282_findHIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int Hcount = 0;
        while (Hcount < n && citations[n - 1 - Hcount] > Hcount) {
            Hcount++;
        }
        return Hcount;
    }
}
