package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/6
 **/
public class Solution1_6 implements Solution {


    @Override
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        dfs(result, 0, 0, n, "");
        return result;
    }

    private void dfs(List<String> result, int left, int right, int n, String path) {
        if (left == n && right == left) {
            result.add(path);
        }

        if (left < n) {
            dfs(result, left + 1, right, n, path + "(");
        }
        if (right < left) {
            dfs(result, left, right + 1, n, path + ")");
        }
    }
}
