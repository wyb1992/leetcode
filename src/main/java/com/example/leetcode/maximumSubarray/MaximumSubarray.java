package com.example.leetcode.maximumSubarray;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wyb on 2018/9/27.
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = new MaximumSubarray().maxSubArray(nums);
        System.out.println(JSONObject.toJSONString(result));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}
