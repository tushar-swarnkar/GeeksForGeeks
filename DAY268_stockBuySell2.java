public class DAY268_stockBuySell2 {

    public int maximumProfit(int prices[]) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // finding minimum price
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // finding maximum profit
        }
        return maxProfit;
    }

}
