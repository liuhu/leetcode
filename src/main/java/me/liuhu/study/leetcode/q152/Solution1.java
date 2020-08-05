package me.liuhu.study.leetcode.q152;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/4
 **/
public class Solution1 implements Solution {

    @Override
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];

        for (int i = 1; i < length; i++) {
            if (nums[i] >= 0) {
                dp[i][0] = Math.min(nums[i], nums[i] * dp[i - 1][0]);
                dp[i][1] = Math.max(nums[i], nums[i] * dp[i - 1][1]);
            } else {
                dp[i][0] = Math.min(nums[i], nums[i] * dp[i - 1][1]);
                dp[i][1] = Math.max(nums[i], nums[i] * dp[i - 1][0]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            max = Math.max(max,  dp[i][1]);
        }
        return max;
    }
}
