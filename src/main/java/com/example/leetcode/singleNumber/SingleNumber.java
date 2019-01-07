package com.example.leetcode.singleNumber;

/**
 * Created by wyb on 2019/1/7.
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = new SingleNumber().singleNumber(nums);
        System.out.println(result);
    }

    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < nums.length; i++) {
            rst ^= nums[i];
        }
        return rst;
    }
}
