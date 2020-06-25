package me.liuhu.study.leetcode.q283;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/23
 **/
public class Solution2 implements Solution {

    /**
     * 题目本身有个限定，只要将非 0 的数据按顺序集中在数组左端
     * 后面的数据都给 0 即可
     *
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param nums
     */
    @Override
    public void moveZeroes(int[] nums) {
        // 记录非 0 的个数
        int notZeroCount = 0;

        // 非 0 的数字按遍历顺序放入数组
        for (int num : nums) {
            if (num != 0) {
                nums[notZeroCount] = num;
                notZeroCount ++;
            }
        }

        // 其余的为 0
        for (int i = notZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
