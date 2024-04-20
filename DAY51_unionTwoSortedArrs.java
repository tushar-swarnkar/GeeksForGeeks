import java.util.ArrayList;
import java.util.TreeSet;

public class DAY51_unionTwoSortedArrs {
    public static void main(String[] args) {
        int n = 5, arr1[] = {1, 2, 3, 4, 5};
        int m = 5, arr2 [] = {1, 2, 3, 6, 7};

        System.out.println(findUnion(arr1, arr2, n, m));
    }

    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        TreeSet<Integer> t = new TreeSet<>();

        for (int i : arr1) {
            t.add(i);
        }
        for (int i : arr2) {
            t.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>(t);
        return ans;
    }
}
