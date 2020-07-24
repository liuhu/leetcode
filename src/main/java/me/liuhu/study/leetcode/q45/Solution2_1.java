package me.liuhu.study.leetcode.q45;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution2_1 implements Solution {

    @Override
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return 0;
        int max = 0, steps = 0, currentEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return -1;
            }
            if (max >= nums.length - 1) {
                return steps + 1;
            }
            if (i > currentEnd) {
                steps ++;
                currentEnd = max;
            }
            max = Math.max(max, i + nums[i]);
        }

        return -1;
    }
}
