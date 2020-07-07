package me.liuhu.study.leetcode.q11;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution2_2 implements Solution {
    @Override
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int tmp = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, tmp);
            if (height[i] > height[j]) {
                j --;
            } else {
                i ++;
            }
        }
        return max;
    }
}
