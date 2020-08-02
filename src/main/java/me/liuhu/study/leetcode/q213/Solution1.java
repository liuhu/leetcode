package me.liuhu.study.leetcode.q213;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/2
 **/
public class Solution1 implements Solution {
    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(help(0, nums.length - 2, nums), help(1, nums.length - 1, nums));
    }

    public int help(int start, int end, int[] nums) {
        int[] pb = new int[nums.length - 1];
        pb[0] = nums[start];
        pb[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i <= end - start; i++) {
            pb[i] = Math.max(pb[i - 1], pb[i - 2] + nums[start + i]);
        }
        return pb[pb.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        System.out.println(solution.rob(new int[]{1,2,3,1}));
    }
}
