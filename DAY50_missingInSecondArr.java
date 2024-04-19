import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DAY50_missingInSecondArr {
    public static void main(String[] args) {
        int n = 6, m = 5;
        int a[] = {1, 2, 3, 4, 5, 10};
        int b[] = {2, 3, 1, 0, 5};

        System.out.println(findMissing(a, b, n, m));
    }

    static ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!set.contains(a[i]))
                al.add(a[i]);
        }
        return al;
    }
}