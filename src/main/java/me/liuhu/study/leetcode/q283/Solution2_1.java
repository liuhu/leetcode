package me.liuhu.study.leetcode.q283;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution2_1 implements Solution {


    @Override
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (num != 0) {
                nums[count] = num;
                count ++;
            }
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
