package me.liuhu.study.leetcode.q46;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/16
 **/
public class Solution1_3 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if (len <= 0) {
            return result;
        }
        boolean[] used = new boolean[len];
        dfs(result, new ArrayList<>(), nums, used, len, 0);
        return result;
    }


    private void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, boolean[] used, int len, int level) {
        if (len == level) {
            result.add(new ArrayList<>(path));
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(result, path, nums, used, len, level + 1);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
