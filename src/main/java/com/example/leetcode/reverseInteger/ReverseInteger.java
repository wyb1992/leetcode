package com.example.leetcode.reverseInteger;

/**
 * 题目描述
 * <p>
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123输出: 321
 * <p>
 * 示例 2:
 * 输入: -123输出: -321
 * <p>
 * 示例 3:输入: 120
 * 输出: 21
 * <p>
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int x = 1000000009;
        int reverse = new ReverseInteger().reverse(x);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = res * 10 + x % 10;
            if (t / 10 != res)
                return 0;
            res = t;
            x /= 10;
        }
        return res;
    }
}
