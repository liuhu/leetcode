package me.liuhu.study.leetcode.q15;

import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public interface Solution {
    /**
     * 判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
     * @param nums 包含 n 个整数的数组
     * @return 找出所有满足条件且不重复的三元组
     */
    List<List<Integer>> threeSum(int[] nums);
}
