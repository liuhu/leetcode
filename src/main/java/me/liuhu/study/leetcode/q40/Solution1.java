package me.liuhu.study.leetcode.q40;

import java.util.*;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/10
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> result = new HashSet<>();
        boolean[] used = new boolean[candidates.length];
        dfs(result, candidates, used, target, new ArrayList<>());
        return new ArrayList<>(result);
    }

    private void dfs(Set<List<Integer>> result, int[] candidates, boolean[] used, int target, List<Integer> path) {
        int sum = path.stream().mapToInt(x -> x).sum();
        if (sum > target) {
            return;
        }
        if ( sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (used[i]) {
                continue;
            }
            if (!path.isEmpty() && path.get(path.size() - 1) > candidates[i]) {
                continue;
            }
            path.add(candidates[i]);
            used[i] = true;

            dfs(result, candidates, used, target, path);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
