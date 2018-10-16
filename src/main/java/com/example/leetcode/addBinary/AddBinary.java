package com.example.leetcode.addBinary;

/**
 * Created by wyb on 2018/10/10.
 */
public class AddBinary {

    public static void main(String[] args) {
        String result = new AddBinary().addBinary("11", "1");
        System.out.println(result);
    }

    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += (i >= 0) ? a.charAt(i) - '0' : 0;
            sum += (j >= 0) ? b.charAt(j) - '0' : 0;
            ans = (sum % 2) + ans;
            carry = sum / 2;
        }
        if (carry != 0) {
            ans = carry + ans;
        }
        return ans;
    }
}
