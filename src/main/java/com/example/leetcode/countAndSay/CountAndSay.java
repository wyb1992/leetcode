package com.example.leetcode.countAndSay;

import com.alibaba.fastjson.JSONObject;

/**
 * 报数序列是指一个整照其中的整数的顺序进数序列，按行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 */
public class CountAndSay {

    public static void main(String[] args) {
        String result = new CountAndSay().countAndSay(10);
        System.out.println(JSONObject.toJSONString(result));
    }

    public String countAndSay(int n) {
        String oldString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char [] oldChars = oldString.toCharArray();

            for (int i = 0; i < oldChars.length; i++) {
                int count = 1;
                while ((i+1) < oldChars.length && oldChars[i] == oldChars[i+1]) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }
            oldString = sb.toString();
        }
        return oldString;

    }
}
