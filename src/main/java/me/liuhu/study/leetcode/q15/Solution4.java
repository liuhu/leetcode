package me.liuhu.study.leetcode.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution4 implements Solution {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int c1 = 0; c1 < nums.length - 2; c1++) {
            int c2 = c1 + 1;
            int c3 = nums.length - 1;

            if (c1 > 0 && nums[c1] == nums[c1 - 1]) {
                continue;
            }
            while (c2 < c3) {
                int sum = nums[c1] + nums[c2] + nums[c3];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[c1], nums[c2], nums[c3]));
                    while (c2 < c3 && nums[c2] == nums[c2 + 1]) {
                        c2++;
                    }
                    while (c2 < c3 && nums[c3] == nums[c3 - 1]) {
                        c3--;
                    }
                    c2++;
                    c3--;
                } else if (sum < 0) {
                    c2++;
                } else {
                    c3--;
                }
            }
        }
        return result;
    }
}
