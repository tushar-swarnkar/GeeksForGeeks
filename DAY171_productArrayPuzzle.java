public class DAY171_productArrayPuzzle {
    public static long[] productExceptSelf(int nums[]) {
        long[] product = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            long prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                prod *= nums[j];
            }
            product[i] = prod;
        }
        return product;
    }
}
