package me.liuhu.study.leetcode.q55;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution2 implements Solution {

    @Override
    public boolean canJump(int[] nums) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > c) {
                return false;
            }
            if (c > nums.length) {
                return true;
            }
            c = Math.max(c, i + nums[i]);
        }
        return true;
    }
}
