package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution1_3 implements Solution {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }

    public void helper(List<String> result, String str, int left, int right, int n) {
        if (left > n || right > n) {
            return;
        }

        if (left == right && left == n) {
            result.add(str);
        }

        if (left < n) {
            helper(result,str + "(", left + 1, right, n);
        }

        if (left > right) {
            helper(result,str + ")", left, right + 1, n);
        }
    }
}
