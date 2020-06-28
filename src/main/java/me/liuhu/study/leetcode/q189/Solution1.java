package me.liuhu.study.leetcode.q189;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/27
 **/
public class Solution1 implements Solution {

    /**
     * Time: O(n)
     * Space: O(n), 但是新开辟了数组，不符合题目要求
     * @param nums
     * @param k
     */
    @Override
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (nums.length <= 1) {
            return;
        }
        int[] new_nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            new_nums[(i + k) % length] = nums[i];
        }
        System.arraycopy(new_nums, 0, nums, 0, nums.length);
    }
}
