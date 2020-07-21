package me.liuhu.study.leetcode.q55;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {

    @Override
    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        return dfs(nums, 0, nums.length - 1);
    }

    private boolean dfs(int[] nums, int level, int len) {
        if (level == len || level + nums[level] >= len) {
            return true;
        }
        int step = nums[level];
        for (int i = 1; i <= step; i++) {
            if (dfs(nums, level + i, len)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        solution.canJump(new int[]{2,0,0});
    }
}
