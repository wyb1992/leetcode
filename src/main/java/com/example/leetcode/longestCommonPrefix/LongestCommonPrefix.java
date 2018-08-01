package com.example.leetcode.longestCommonPrefix;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] characters = {"flower","flow","flight"};
        String s = new LongestCommonPrefix().longestCommonPrefix(characters);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        String sb = "";
        for (int i = 1, length = strs.length; i < length; i++) {
            String[] old = StringUtils.isBlank(sb) ? strs[0].split("") : sb.split("");
            String[] array = strs[i].split("");
            for (int j = 0, len = array.length; j < len; j++) {
                if (array[j].equals(old[j])) {
                    System.out.println(JSONObject.toJSONString(Arrays.copyOfRange(array, 0, j)));
                }
            }
        }
        return sb;
    }
}
