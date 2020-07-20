package me.liuhu.study.leetcode.q33;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/20
 **/
public class Solution1_1 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) { // 说明左边是递增的

            } else {

            }
        }
        return -1;
    }
}
