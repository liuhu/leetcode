package me.liuhu.study.leetcode.q55;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution2_1 implements Solution {

    @Override
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            if (max >= nums.length - 1) {
                return true;
            }
            max = Math.max(max, i + nums[i]);
        }
        return false;
    }

}
