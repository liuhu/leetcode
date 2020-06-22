package me.liuhu.study.leetcode.q11;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/22
 **/
public class Solution1 implements Solution {

    /**
     * 暴力解法
     * 时间复杂度 O(n2)
     * 空间复杂度 O(1)
     * @param height
     * @return
     */
    @Override
    public int maxArea(int[] height) {
        int maxArea = -1;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int high = Math.min(height[i], height[j]);
                int area = (j - i) * high;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
