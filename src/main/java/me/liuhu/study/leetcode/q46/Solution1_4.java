package me.liuhu.study.leetcode.q46;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/5
 **/
public class Solution1_4 implements Solution {
    @Override
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        dfs(nums, result, path);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> path) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);

            dfs(nums, result, path);

            path.remove(path.size() - 1);
        }
    }
}
