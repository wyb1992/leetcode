package com.example.leetcode.plusOne;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wyb on 2018/10/8.
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {1, 2, 11};
        int[] result = new PlusOne().plusOne(nums);
        System.out.println(JSONObject.toJSONString(result));
    }

    public int[] plusOne(int[] digits) {
        int carries = 1;
        for (int i = digits.length - 1; i >= 0 && carries > 0; i--) {  // fast break when carries equals zero
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }
        if (carries == 0)
            return digits;

        int[] rst = new int[digits.length + 1];
        rst[0] = 1;
        for (int i = 1; i < rst.length; i++) {
            rst[i] = digits[i - 1];
        }
        return rst;
    }
}
