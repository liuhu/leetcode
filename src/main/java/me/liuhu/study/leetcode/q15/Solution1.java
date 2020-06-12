package me.liuhu.study.leetcode.q15;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/12
 **/
public class Solution1 implements Solution {


    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k]);
                        resultMap.put(hashCodeForList(result), result);
                    }
                }
            }
        }

        return new ArrayList<>(resultMap.values());
    }

    /**
     * 计算 List 的 hashCode 用于比较是否存在相同解
     * @param nums
     * @return
     */
    private static int hashCodeForList(List<Integer> nums) {
        nums.sort(Integer::compareTo);
        return nums.hashCode();
    }
}
