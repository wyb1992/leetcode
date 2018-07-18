package com.example.leetcode.longestSubstringWithoutRepeatingCharacters;

/*
    * 题目描述
    *
    * 给定一个字符串，找出不含有重复字符的最长子串的长度。
    * 示例：
    * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
    * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
    * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。
    * 请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
    * */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String characters = "abcabcbb";
        int result = new LongestSubstringWithoutRepeatingCharacters().longestSubstringWithoutRepeatingCharacters(characters);
        System.out.println(result);
    }

    public int longestSubstringWithoutRepeatingCharacters(String characters) {
        char[] array = characters.toCharArray();
        int[] cnt = new int[256];
        int result = 0;
        for (int i = 0, j = 0, len = characters.length(); i < len; i++) {
            cnt[array[i]]++;
            while (cnt[array[i]] > 1) {
                cnt[array[j]]--;
                j++;
            }
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}
