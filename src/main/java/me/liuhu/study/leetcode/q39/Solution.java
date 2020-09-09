package me.liuhu.study.leetcode.q39;

import java.util.List;

/**
 * 39. 组合总和
 * https://leetcode-cn.com/problems/combination-sum/
 *
 * 给定一个无重复元素的数组candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。
 * candidates中的数字可以无限制重复被选取。
 *
 * 说明：
 * 所有数字（包括target）都是正整数。
 * 解集不能包含重复的组合。
 *
 * 示例1：
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/9/9
 **/
public interface Solution {

    List<List<Integer>> combinationSum(int[] candidates, int target);
}
