package me.liuhu.study.leetcode.q77;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/8
 **/
public class Solution1_2 implements Solution {
    @Override
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;
        dfs(result, new ArrayList<>(), nums, k);
        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, int k) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (!path.isEmpty() && path.get(path.size() - 1) >= num) {
                continue;
            }
            path.add(num);
            dfs(result, path, nums, k);
            path.remove(path.size() - 1);
        }
    }
}
