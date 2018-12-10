package com.example.leetcode.pascalsTriangle;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyb on 2018/12/10.
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = new PascalsTriangle().generate(4);
        System.out.println(JSONArray.toJSON(result));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return rst;
        }

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(0, 1);
        rst.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(i + 1);
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            List<Integer> prev = rst.get(i - 1);
            tmp.set(0, prev.get(0));
            tmp.set(i, prev.get(i - 1));
            for (int j = 1; j < i; j++){
                tmp.set(j, prev.get(j - 1)+prev.get(j));
            }
            rst.add(tmp);
        }
        return rst;
    }
}
