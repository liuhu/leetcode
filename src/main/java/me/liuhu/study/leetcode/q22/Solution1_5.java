package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/22
 **/
public class Solution1_5 implements Solution {
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs("", result, n, 0, 0);
        return result;
    }

    private void dfs(String str, List<String> result, int n, int left, int right) {
        if (left == n && right == n) {
            result.add(str);
            return;
        }

        if (left < n) {
            dfs(str + "(", result, n, left + 1, right);
        }
        if (right < left) {
            dfs(str + ")", result, n, left, right + 1);
        }
    }
}
