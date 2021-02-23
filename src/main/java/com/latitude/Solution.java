package com.latitude;

/**
 * Solution Class
 *
 * @author Temin
 *
 */
public class Solution {
    /**
     * A function for finding the maximum profit
     *
     * Assumption 1: stockPrice >= 0
     * Assumption 2: When the best profit is less than zero, zero should be returned
     *
     * Preference: I prefer a long variable name for higher readability than comments
     * because when code is changed, comment also needs to be changed.
     * It means more maintenance cost
     * This logic is not complicated so I don't think it needs a comment.
     *
     * @param stockPrices stock prices every minute from 10 am local time
     * @return maximum benefit
     */
    public int getMaxProfit(int[] stockPrices) {
        if (stockPrices == null) {
            return 0;
        }
        int stockPricesCount = stockPrices.length;
        if (stockPricesCount < 2) {
            return 0;
        }

        int minStockPrice = stockPrices[0];
        int maxBenefit = 0;
        for (int stockPriceIndex = 1; stockPriceIndex < stockPricesCount; stockPriceIndex++) {
            int currentStockPrice = stockPrices[stockPriceIndex];
            int currentMaxBenefit = currentStockPrice - minStockPrice;

            if (currentMaxBenefit > maxBenefit) {
                maxBenefit = currentMaxBenefit;
            }
            if (minStockPrice > currentStockPrice) {
                minStockPrice = currentStockPrice;
            }
        }

        return maxBenefit;
    }
}
