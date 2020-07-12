package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/12
 **/
public class Solution1_4 implements Solution {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(0, 0, n, "", result);
        return result;
    }

    private void helper(int left, int right, int n, String str, List<String> result) {
        if (left > n) {
            return;
        }

        if (left == n && right == n) {
            result.add(str);
        }

        if (left < n) {
            helper(left + 1, right, n, str + "(", result);
        }

        if (right < left) {
            helper(left, right + 1, n, str + ")", result);
        }
    }
}
