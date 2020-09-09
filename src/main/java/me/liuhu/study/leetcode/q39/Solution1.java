package me.liuhu.study.leetcode.q39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/9
 **/
public class Solution1 implements Solution {
    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), target, candidates);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int target, int[] candidates) {
        int sum = path.stream().mapToInt(x -> x).sum();
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : candidates) {
            if (path.size() > 0 && path.get(path.size() - 1) < num) {
                continue;
            }
            path.add(num);
            dfs(result, path, target, candidates);
            path.remove(path.size() - 1);
        }
    }
}
