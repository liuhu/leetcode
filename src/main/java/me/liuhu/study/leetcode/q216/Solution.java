package me.liuhu.study.leetcode.q216;

import java.util.List;

/**
 * 216. 组合总和 III
 * https://leetcode-cn.com/problems/combination-sum-iii/
 *
 * 找出所有相加之和为n 的k个数的组合。组合中只允许含有 1 -9 的正整数，并且每种组合中不存在重复的数字。
 *
 * 说明：
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。
 *
 * 示例 1:
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/11
 **/
public interface Solution {
    List<List<Integer>> combinationSum3(int k, int n);
}
