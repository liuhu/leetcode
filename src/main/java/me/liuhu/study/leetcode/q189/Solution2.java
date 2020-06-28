package me.liuhu.study.leetcode.q189;


/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/27
 **/
public class Solution2 implements Solution {

    /**
     * 当我们旋转数组 k 次， k%n 个尾部元素会被移动到头部，剩下的元素会被向后移动
     * Step1 反转所以元素
     * Step2 反转前 k 个元素
     * Step3 反转后 n-k 个元素
     * 原始数组                  : 1 2 3 4 5 6 7
     * 反转所有数字后             : 7 6 5 4 3 2 1
     * 反转前 k 个数字后          : 5 6 7 4 3 2 1
     * 反转后 n-k 个数字后        : 5 6 7 1 2 3 4 --> 结果
     *
     * Time: O(n)
     * Space: O(1)
     * @param nums
     * @param k
     */
    @Override
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}
