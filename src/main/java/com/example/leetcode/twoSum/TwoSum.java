/**
 * Created by wyb on 2018/6/20.
 */
package com.example.leetcode.twoSum;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

/*
    * 题目描述
    *
    * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
    * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
    * 示例:
    * 给定 nums = [2, 7, 11, 15], target = 9
    * 因为 nums[0] + nums[1] = 2 + 7 = 9
    * 所以返回 [0, 1]
    *
    * */
class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] result = new TwoSum().twoSum(nums, 6);
        System.out.println(JSONObject.toJSONString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            final Integer v = map.get(target-nums[i]);
            if (v != null && v > i) {
                return new int[]{i+1, v+1};
            }
        }
        return null;
    }

}