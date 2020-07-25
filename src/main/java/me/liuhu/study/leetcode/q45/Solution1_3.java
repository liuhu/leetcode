package me.liuhu.study.leetcode.q45;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution1_3 implements Solution {

    @Override
    public int jump(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] count = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= nums.length - 1) {
                return count[count.length - 1];
            }
            max = Math.max(max, i + nums[i]);
            for (int j = 1; j <= nums[i]; j++) {
                int idx = i + j;
                if (idx < nums.length && count[idx] == 0) {
                    count[idx] = count[i] + 1;
                }
            }
        }
        return count[count.length - 1];
    }
}
