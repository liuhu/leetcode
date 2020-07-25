package me.liuhu.study.leetcode.q55;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution2_2 implements Solution {

    @Override
    public boolean canJump(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
           if (i > max) {
               return false;
           }
           max = Math.max(max, i + nums[i]);
           if (max >= nums.length - 1) {
               return true;
           }
        }
        return false;
    }
}
