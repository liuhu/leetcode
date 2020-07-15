package me.liuhu.study.leetcode.q78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/15
 **/
public class Solution1_2 implements Solution {


    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }


    private void backtrack(List<List<Integer>> list, List<Integer> path, int[] nums, int level) {
        list.add(new ArrayList<>(path));

        //  i = level 实为剪枝行为
        for (int i = level; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(list, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_2();
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}
