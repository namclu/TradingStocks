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
        int minPrice = stockPricesYesterday[0];
        int maxProfit = 0;

        for (int currentPrice : stockPricesYesterday) {

            // ensure minPrice is the lowest price we've seen so far
            // minPrice = 10, 7, 5, 5, 5, 5,
            minPrice = Math.min(minPrice, currentPrice);
            System.out.println("minPrice: " + minPrice);

            // see what our profit would be if we bought at the
            // min price and sold at the current price
            // potentialProfit = 10 - 10 = 0, 7 - 7 = 0, 5 - 5 = 0, 8 - 5 = 3, 11 - 5 = 6, 9 - 5 = 4,
            int potentialProfit = currentPrice - minPrice;
            System.out.println("potentialProfit: " + potentialProfit);

            // update maxProfit if we can do better
            // maxProfit = 0, 0, 0, 3, 6, 6,
            maxProfit = Math.max(maxProfit, potentialProfit);
            System.out.println("maxProfit: " + maxProfit);
            System.out.println("---");
        }

        return maxProfit;
    }
}
