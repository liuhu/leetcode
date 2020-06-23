package me.liuhu.study.leetcode.q11;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/22
 **/
public class Solution2 implements Solution {

    /**
     * 双指针解法
     * 时间复杂度为 O(n), 因为列表只遍历的一遍
     * 空间复杂度为 O(1)
     * @param height
     * @return
     */
    @Override
    public int maxArea(int[] height) {
        // 左指针下标
        int left = 0;
        // 右指针下标
        int right = height.length - 1;
        // 最大面积
        int maxArea = -1;

        while (left < right) {
            int tmpArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(tmpArea, maxArea);
            if (height[left] > height[right]) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }
        return maxArea;
    }
}
