package me.liuhu.study.leetcode.q78;

import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * @description:
 * @author: LiuHu
 * @create: 2020/7/14
 **/
public interface Solution {

    List<List<Integer>> subsets(int[] nums);
}
