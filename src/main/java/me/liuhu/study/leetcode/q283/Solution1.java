package me.liuhu.study.leetcode.q283;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/23
 **/
public class Solution1 implements Solution {

    /**
     * 必须在原数组上操作 -> 只能靠中间变量交换来解决
     * 减少操作次数 -> 因为要保持相对顺序，就要尽量减少移动次数
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
                right =  right - 1;
                continue;
            }

            // 左指针遇到 0，则开始进行移动，否则移动到下个指针
            if (nums[left] == 0) {
                swap(nums, left, right);
            } else {
                left ++;
            }
        }
    }

    /**
     * 数组顺序交换
     * @param nums
     * @param indexLeft 要交换的数组下标
     * @param indexRight 目标数组下标
     */
    protected void swap(int[] nums, int indexLeft, int indexRight) {
        while (indexLeft < indexRight) {
            int tmp = nums[indexLeft];
            nums[indexLeft] = nums[indexLeft + 1];
            nums[indexLeft + 1] = tmp;
            indexLeft++;
        }
    }
}
