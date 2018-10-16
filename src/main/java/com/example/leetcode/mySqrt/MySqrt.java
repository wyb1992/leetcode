package com.example.leetcode.mySqrt;

/**
 * Created by wyb on 2018/10/16.
 */
public class MySqrt {

    public static void main(String[] args) {
        int result = new MySqrt().mySqrt(4);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end * end <= x) {
            return (int) end;
        }
        return (int) start;
    }
}
