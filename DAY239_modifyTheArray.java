import java.util.ArrayList;

public class DAY239_modifyTheArray {

    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        ArrayList<Integer> li = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                li.add(arr[i]);
            } else {
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            li.add(0);
        }
        return li;
    }

}
