package me.liuhu.study.leetcode.q33;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution1_2 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[mid] >= nums[left]) { // 说明左边是递增的
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left =  mid + 1;
                } else {
                    right =  mid - 1;
                }
            }
        }
        return -1;
    }
}
