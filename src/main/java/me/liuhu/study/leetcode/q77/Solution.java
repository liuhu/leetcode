package me.liuhu.study.leetcode.q77;

import java.util.List;

/**
 * 77. 组合
 * https://leetcode-cn.com/problems/combinations/
 *
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [1,2],
 *   [1,3],
 *   [1,4],
 *   [2,3],
 *   [2,4],
 *   [3,4]
 * ]
 * @description:
 * @author: LiuHu
 * @create: 2020/7/14
 **/
public interface Solution {
    List<List<Integer>> combine(int n, int k);
}
