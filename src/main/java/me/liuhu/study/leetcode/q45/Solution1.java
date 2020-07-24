package me.liuhu.study.leetcode.q45;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {
    
    @Override
    public int jump(int[] nums) {
        int c = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > c) {
                return -1;
            }
            if (c >= nums.length - 1) {
                return step;
            }
            int tmp = i + nums[i];
            if (tmp > c) {
                c = tmp;
                step ++;
            }
        }
        return -1;
    }
}
