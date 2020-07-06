package me.liuhu.study.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1 implements Solution {

    List<String> res = new ArrayList<>();
    @Override
    public List<String> generateParenthesis(int n) {
        helper(0, 0, "", n);
        return res;
    }

    public void helper(int left, int right, String s, int n) {
        if (left == n && right == n) {
            res.add(s);
        }

        if (left < n) {
            helper(left + 1, right, s + "(", n);
        }
        if (right < left) {
            helper(left, right + 1, s + ")", n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        System.out.println( solution.generateParenthesis(3));
    }
}
