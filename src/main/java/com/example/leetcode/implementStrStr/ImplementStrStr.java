package com.example.leetcode.implementStrStr;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wyb on 2018/9/10.
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        int result = new ImplementStrStr().strStr(haystack, needle);
        System.out.println(JSONObject.toJSONString(result));
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        // i < haystack.length() - needle.length() + 1，加入总长5，只需匹配到5 - 2 + 1即可，这位没有匹配到，最后的长度不足目标的字符串长度
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
