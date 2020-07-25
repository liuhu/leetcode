package me.liuhu.study.leetcode.q75;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution3 implements Solution {

    @Override
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int left = 0, k = 0, right = nums.length - 1;
        while (k <= right) {
            // 遇到0, k 和 左指针交换，目的是为了将0放在左边
            if (nums[k] == 0) {
                swap(nums, left, k);
                left++;
                k++;
            } else if (nums[k] == 1) { // 遇到1, k
                ++k;
            } else { // 遇到2, k 和 右指针交换，目的是为了将2放在右边
                swap(nums, k, right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
