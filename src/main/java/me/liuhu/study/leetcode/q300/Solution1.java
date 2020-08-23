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
            for (int j = 0; j < i; j++) {
                // 如果 nums[i] > nums[[0~i)], 则说明 nums[i] 可以追加到之前到结果中
                if (nums[i] > nums[j]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                } else {
                    d[i] = Math.max(d[i], 1);
                }
            }
            max = Math.max(max, d[i]);
        }
        return max;
    }
}
