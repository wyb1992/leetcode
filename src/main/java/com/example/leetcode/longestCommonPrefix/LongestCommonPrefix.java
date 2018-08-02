package com.example.leetcode.longestCommonPrefix;

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
        String prefix = strs[0];
        for (int i = 1, length = strs.length; i < length; i++) {
            int j = 0;
            while( j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if( j == 0)
                return "";
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
