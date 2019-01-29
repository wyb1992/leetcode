package com.example.leetcode.twoSumInputArrayIsSorted;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wyb on 2019/1/29.
 */
public class TwoSumInputArrayIsSorted {

    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int result[] = new TwoSumInputArrayIsSorted().twoSum(numbers, 9);
        System.out.println(JSONObject.toJSONString(result));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
