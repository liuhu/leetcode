package me.liuhu.study.leetcode.q198;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/2
 **/
public class Solution1 implements Solution {
    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] pb = new int[nums.length];
        pb[0] = nums[0];
        pb[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            pb[i] = Math.max(pb[i - 1], pb[i - 2] + nums[i]);
        }
        return pb[pb.length - 1];
    }
}
