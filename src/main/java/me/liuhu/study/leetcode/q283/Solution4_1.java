package me.liuhu.study.leetcode.q283;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution4_1 implements Solution {

    @Override
    public void moveZeroes(int[] nums) {

        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
                continue;
            }

            if (nums[j] != 0) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                i++;
            }
        }
    }
}
