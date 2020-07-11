package me.liuhu.study.leetcode.q46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @description:
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * @author: LiuHu
 * @create: 2020/7/9
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

    private void permute(List<List<Integer>> result, List<Integer> nums, int level) {
        if (nums.isEmpty()) {
            return;
        }
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }

        for (int num : nums) {
            result.get(level).add(num);
            List<Integer> next = nums.stream().filter(x -> x != num).collect(Collectors.toList());
            permute(result, next, level);
        }
    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int[] nums = {1, 2, 3};
        s.permute(nums);
    }
}
