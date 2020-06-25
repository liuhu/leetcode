package me.liuhu.study.leetcode.q283;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/23
 **/
public class Solution1 implements Solution {

    /**
     * 双指针方法：
     * 1、找到右边不是 0 的数组下标，作为待交换数字
     * 2、左边找到为 0 的数组下标，则开始按顺序交换
     * 3、当左边和右边相遇则结束
     *
     *
     * 时间复杂度 O(n2)
     * 空间复杂度 O(1)
     * @param nums
     */
    @Override
    public void moveZeroes(int[] nums) {
        // 左指针
        int left = 0;
        // 右指针，标识下一个要交换到的目标位置
        int right = nums.length - 1;

        while (left < right) {

            // 找到最右边不为 0 的位置
            if (nums[right] == 0) {
                right --;
                continue;
            }

            // 左指针遇到 0，则开始进行移动，否则移动到下个指针
            if (nums[left] == 0) {
                orderSwap(nums, left, right);
            } else {
                left ++;
            }
        }
    }

    /**
     * 数组顺序交换
     * int[] nums = {0, 1, 2, 3, 0};
     * solution.orderSwap(nums, 0,  3);
     * int[] expected = {1, 2, 3, 0, 0};
     * @param nums
     * @param indexLeft 要交换的数组下标
     * @param indexRight 目标数组下标
     */
    protected void orderSwap(int[] nums, int indexLeft, int indexRight) {
        while (indexLeft < indexRight) {
            int tmp = nums[indexLeft];
            nums[indexLeft] = nums[indexLeft + 1];
            nums[indexLeft + 1] = tmp;
            indexLeft++;
        }
    }
}
