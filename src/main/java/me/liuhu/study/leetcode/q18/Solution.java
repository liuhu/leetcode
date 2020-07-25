package me.liuhu.study.leetcode.q18;

import java.util.List;

/**
 * 18. 四数之和
 * https://leetcode-cn.com/problems/4sum/
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public interface Solution {

    List<List<Integer>> fourSum(int[] nums, int target);
}
