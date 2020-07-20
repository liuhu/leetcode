package me.liuhu.study.leetcode.q33;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/19
 **/
public class Solution1 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = ((right - left) >> 1) + left;
            System.out.println("left:" + left + " right:" + right + " mid:" + mid);
            if (nums[mid] == target) {
                return mid;
            }
            // Step1: 先根据 nums[mid] 与 nums[left] 的关系判断 mid 是在左还是右 递增的 子数组上
            // 左边是顺序的
            if (nums[mid] >= nums[left]) {
                // Step2: 判断 target 是在 mid 的左边还是右边
                //  nums[mid] > target
                //  target >= nums[left]
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else { // nums[mid] < target
                    left = mid + 1;
                }
            } else {
                // nums[mid] < target
                // target <= nums[right]
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else { // nums[mid] > target
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution1();
        solution.search(new int[]{4,5,6,7,8,1,2}, 2);
    }
}
