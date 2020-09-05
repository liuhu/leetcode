package me.liuhu.study.leetcode.q46;

import java.util.List;

/**
 * 46. 全排列
 * https://leetcode-cn.com/problems/permutations/
 *
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public interface Solution {
    List<List<Integer>> permute(int[] nums);
}
