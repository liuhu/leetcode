package me.liuhu.study.leetcode.q60;

/**
 * 60. 第k个排列
 * https://leetcode-cn.com/problems/permutation-sequence/
 *
 * 给出集合[1,2,3,…,n]，其所有元素共有n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定n 和k，返回第k个排列。
 *
 * 说明：
 * 给定 n的范围是 [1, 9]。
 * 给定 k的范围是[1, n!]。
 *
 * 示例1:
 * 输入: n = 3, k = 3
 * 输出: "213"
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/5
 **/
public interface Solution {
    String getPermutation(int n, int k);
}
