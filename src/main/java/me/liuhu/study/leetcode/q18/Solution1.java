package me.liuhu.study.leetcode.q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/25
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);
        for (int c1 = 0; c1 < nums.length - 3; c1++) {
            if (nums[c1] + nums[c1 + 1] + nums[c1 + 2] + nums[c1 + 3] > target) {
                break;
            }
            if (nums[c1] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 2] < target) {
                continue;
            }
            if (c1 > 0 && nums[c1] == nums[c1 - 1]) {
                continue;
            }
            for (int c2 = c1 + 1; c2 < nums.length - 2; c2++) {
                if (nums[c1] + nums[c2] + nums[c2 + 1] + nums[c2 + 2] > target) {
                    break;
                }
                if (nums[c1] + nums[c2] + nums[nums.length - 1] + nums[nums.length - 2] < target) {
                    continue;
                }
                if (c2 > c1 + 1 && nums[c2] == nums[c2 - 1]) {
                    continue;
                }
                int c3 = c2 + 1;
                int c4 = nums.length - 1;
                while (c3 < c4) {
                    int sum = nums[c1] + nums[c2] + nums[c3] + nums[c4];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[c1], nums[c2], nums[c3], nums[c4]));
                        while (c3 < c4 && nums[c3] == nums[c3 + 1]) {
                            c3++;
                        }
                        while (c4 > c3 && nums[c4] == nums[c4 - 1]) {
                            c4--;
                        }
                        c3++;
                        c4--;
                    } else if (sum < target) {
                        c3++;
                    } else {
                        c4--;
                    }
                }
            }
        }
        return result;
    }
}
