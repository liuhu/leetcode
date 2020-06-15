package me.liuhu.study.leetcode.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/15
 **/
public class Solution3 implements Solution {


    /**
     * 对数组从小到大排序
     * https://leetcode-cn.com/problems/3sum/solution/pai-xu-shuang-zhi-zhen-zhu-xing-jie-shi-python3-by/
     *
     * @param nums 包含 n 个整数的数组
     * @return
     */
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        // 对数组排序
        Arrays.sort(nums);
        int length = nums.length;
        // 结果集
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i + 2 < length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            // 排除相同解
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = length - 1;

            while (j < k) {
                int sum_i_j_k = nums[i] + nums[j] + nums[k];
                if (sum_i_j_k == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) { // 排除相同解
                        j = j + 1;
                    }
                    while (j < k && nums[k] == nums[k - 1]) { // 排除相同解
                        k = k - 1;
                    }
                    j = j + 1;
                    k = k - 1;
                } else if (sum_i_j_k > 0) {
                    k = k - 1;
                } else {
                    j = j + 1;
                }
            }
        }

        return result;
    }
}
