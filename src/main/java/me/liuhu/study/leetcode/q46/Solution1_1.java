package me.liuhu.study.leetcode.q46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/12
 **/
public class Solution1_1 implements Solution {
    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums || nums.length == 0) {
            return result;
        }

        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        helper(numList, 0, result);
        return result;
    }

    private void helper(List<Integer> nums, int start, List<List<Integer>> result) {
        if (nums.size() == start) {
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++) {
            Collections.swap(nums, i, start);
            helper(nums, start + 1, result);
            Collections.swap(nums, start, i);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_1();
        int[] nums = new int[]{1, 2, 3};
        solution.permute(nums);
    }
}
