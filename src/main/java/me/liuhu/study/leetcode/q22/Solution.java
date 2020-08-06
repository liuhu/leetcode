package me.liuhu.study.leetcode.q22;

import java.util.List;

/**
 * 22. 括号生成
 * https://leetcode-cn.com/problems/generate-parentheses/
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public interface Solution {
    List<String> generateParenthesis(int n);
}
