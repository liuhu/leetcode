package me.liuhu.study.leetcode.q169;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/12
 **/
public class Solution2 implements Solution {

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    private int majorityElementRec(int[] nums, int low, int high) {
        // Step1: 最小子问题, 直接得出结果, 也是递归终止条件
        // 这里就是将数组分解成只有一个元素
        if (low == high) {
            return nums[low];
        }

        // Step2: 准备数据
        // 这里将数据一切为二
        int mid = (high - low) / 2 + low;

        // Step3: 分解并求出子问题
        // 这里是求出左多数和右多数
        int left = majorityElementRec(nums, low, mid);
        int right = majorityElementRec(nums, mid + 1, high);

        // Step4: 合并结果, 得出最终结果
        // 这里是返回左右两边数量最多的数
        if (left == right) {
            return left;
        }
        int leftCount = countInRange(nums, left, low, high);
        int rightCount = countInRange(nums, right, low, high);

        return leftCount > rightCount ? left : right;
        // Step5: 恢复状态
    }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
}
