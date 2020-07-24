package me.liuhu.study.leetcode.q153;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution1_1 implements Solution {

    @Override
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1, mid;

        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }

        return nums[right];
    }
}
