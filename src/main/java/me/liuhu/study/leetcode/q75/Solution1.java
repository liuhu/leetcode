package me.liuhu.study.leetcode.q75;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution1 implements Solution {

    @Override
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        for (int i = 0; i <= r ; i++) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            }
            if (nums[i] == 2) {
                swap(nums, i--, r--);
            }
        }
    }

    private void swap(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        solution.sortColors(new int[]{0,0,2,1,0});
    }
}
