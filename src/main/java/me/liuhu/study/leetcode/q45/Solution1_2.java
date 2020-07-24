package me.liuhu.study.leetcode.q45;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution1_2 implements Solution {

    @Override
    public int jump(int[] nums) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        int[] count = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return -1;
            }
            if (max >= nums.length - 1) {
                return count[nums.length - 1];
            }
            max = Math.max(max, i + nums[i]);

            for (int j = 1; j <= nums[i]; j++) {
                int idx = i + j;
                if (idx <= nums.length - 1 && count[i + j] == 0) {
                    count[i + j] = count[i] + 1;
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_2();
        solution.jump(new int[]{1,2,1,1,1});
    }
}
