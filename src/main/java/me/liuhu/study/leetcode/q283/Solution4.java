package me.liuhu.study.leetcode.q283;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/23
 **/
public class Solution4 implements Solution {

    /**
     * 遍历交换
     * 减少不必要的交换操作
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param nums
     */
    @Override
    public void moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != 0) {
                i ++;
                continue;
            }

            if (nums[j] != 0) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                i ++;
            }
        }
    }
}
