public class DAY227_smallestInEverySubarray {

    public int pairWithMaxSum(int[] arr) {

        if (arr.length <= 1)
            return -1;
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] + arr[i - 1]);
        }
        return res;
    }

}
