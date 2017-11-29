/*
* Sample problem:
*
* int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
*
* getMaxProfit(stockPricesYesterday);
* // returns 6 (buying for $5 and selling for $11)
* */
public class TradingStocks {

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};

        System.out.println(getMaxProfit(stockPricesYesterday));
    }

    private static int getMaxProfit(int[] stockPricesYesterday) {
        int maxProfit = 0;

        for (int buyIndex = 0; buyIndex < (stockPricesYesterday.length - 1); buyIndex++) {
            // buyIndex = 0, 1, < 5, buyPrice = 10, 7,
            int buyPrice = stockPricesYesterday[buyIndex];

            for (int sellIndex = buyIndex + 1; sellIndex < stockPricesYesterday.length; sellIndex++) {
                // sellIndex = 1, 2, 3, 4, 5, 6 < 6, sellPrice = 7, 5, 8, 11, 9  profit = -3, -5, -2, 1, -1
                // sellIndex = 2, 3, 4, 5, 6 < 6, sellPrice = 5, 8, 11, 9, profit = -2, 1, 4, 2
                int sellPrice = stockPricesYesterday[sellIndex];
                int profit = sellPrice - buyPrice;

                maxProfit = Math.max(maxProfit, profit); //maxProfit = 1
            }
        }
        return maxProfit;
    }
}
