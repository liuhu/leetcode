package me.liuhu.study.leetcode.q47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/16
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return new ArrayList<>();
        }
        boolean[] used = new boolean[len];
        Set<List<Integer>> result = new HashSet<>();
        dfs(result, new ArrayList<>(), used, nums, 0, len);
        return new ArrayList<>(result);
    }

    private void dfs(Set<List<Integer>> result, List<Integer> path, boolean[] used, int[] nums, int level, int len) {
        if (len == level) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len ; i++) {
            if (used[i]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            dfs(result, path, used, nums, level + 1, len);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution1();
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> lists = solution.permuteUnique(nums);
        System.out.println(lists);
    }
}
