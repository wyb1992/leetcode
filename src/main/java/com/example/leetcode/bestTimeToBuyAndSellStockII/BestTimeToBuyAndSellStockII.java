package com.example.leetcode.bestTimeToBuyAndSellStockII;

import com.example.leetcode.bestTimeToBuyAndSellStock.BestTimeToBuyAndSellStock;

/**
 * Created by wyb on 2018/12/27.
 */
public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result = new BestTimeToBuyAndSellStock().maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }
}
