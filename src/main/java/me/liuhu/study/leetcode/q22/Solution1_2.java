package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution1_2 implements Solution {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, 0, 0, n, "");
        return res;
    }

    public void helper(List<String> res, int left, int right, int n, String str){
        if (left == n && right == n) {
            res.add(str);
        }

        if (left < n) {
            helper(res, left + 1, right, n, str + "(");
        }

        if (right < left) {
            helper(res, left, right + 1, n, str + ")");
        }
    }
}
