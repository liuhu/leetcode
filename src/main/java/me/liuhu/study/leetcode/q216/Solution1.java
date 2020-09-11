package me.liuhu.study.leetcode.q216;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/11
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) nums[i] = i + 1;
        dfs(result, new ArrayList<>(), 0, nums, k, n);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int deep, int[] nums, int k, int n) {
        if (path.size() == k && n == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (n < 0) {
            return;
        }


        for (int i = deep; i < nums.length; i++) {
            if (!path.isEmpty() && path.get(path.size() - 1) >= nums[i]) {
                continue;
            }

            path.add(nums[i]);

            dfs(result, path, deep + 1, nums, k, n - nums[i]);

            path.remove(path.size() - 1);
        }
    }
}
