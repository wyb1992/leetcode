package com.example.leetcode.climbingStairs;

/**
 * Created by wyb on 2018/10/22.
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        int result = new ClimbingStairs().climbStairs(10);
        System.out.println(result);
    }

    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int last = 1, lastlast = 1;
        int now = 0;
        for (int i = 2; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
    }
}
