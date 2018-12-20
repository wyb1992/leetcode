package com.example.leetcode.bestTimeToBuyAndSellStock;

/**
 * Created by wyb on 2018/12/20.
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int result = new BestTimeToBuyAndSellStock().maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }

        return profit;
    }
}
