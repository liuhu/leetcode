package me.liuhu.study.leetcode.q300;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/22
 **/
public class Solution1 implements Solution {

    @Override
    public int lengthOfLIS(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length];
        d[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int cur = -1;
            // 计算 0 ~ i 中子序最长
            for (int j = 0; j < i; j++) {
                // nums[i] > nums[j], 则 nums[i] 可追加到原来 d[j] 的结果中
                if (nums[i] > nums[j]) {
                    cur = Math.max(cur, d[j] + 1);
                } else { // 否则, nums[i] 自成一个序列
                    cur = Math.max(cur, 1);
                }
            }
            d[i] = Math.max(d[i], cur);
            max = Math.max(max, d[i]);
        }
        return max;
    }
}
