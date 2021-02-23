package com.latitude;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test for Solution Class
 *
 * @author Temin
 *
 */
public class SolutionTest {
    private void verifyGetMaxProfit(int[] prices, int profit) {
        Solution solution = new Solution();
        Assertions.assertEquals(profit, solution.getMaxProfit(prices));
    }
    
    @Test
    public void testNormalStockPrices() {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        int expectedProfit = 6;
        
        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testNullStockPrices() {
        int expectedProfit = 0;

        verifyGetMaxProfit(null, expectedProfit);
    }

    @Test
    public void testEmptyStockPrices() {
        int[] stockPrices = {};
        int expectedProfit = 0;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testOneStockPrice() {
        int[] stockPrices = {1};
        int expectedProfit = 0;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testTwoStockPrices() {
        int[] stockPrices = {1, 10};
        int expectedProfit = 9;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testMaxStockPricesCount() {
        // Max stock prices: 60min x 24hr
        int[] stockPrices = new int[1440];
        for (int stockPricesIndex = 0; stockPricesIndex < 1440; stockPricesIndex++) {
            stockPrices[stockPricesIndex] = stockPricesIndex;
        }
        int expectedProfit = 1439;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testReducingStockPrices() {
        int[] stockPrices = {9, 8, 7};
        int expectedProfit = 0;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testSmallerAndSameStockPricesThanFirstPrice() {
        int[] stockPrices = {9, 8, 8};
        int expectedProfit = 0;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testSameStockPrices() {
        int[] stockPrices = {1, 1, 1};
        int expectedProfit = 0;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }

    @Test
    public void testMinAndMaxStockPrices() {
        int[] stockPrices = {0, Integer.MAX_VALUE};
        int expectedProfit = Integer.MAX_VALUE;

        verifyGetMaxProfit(stockPrices, expectedProfit);
    }
}
