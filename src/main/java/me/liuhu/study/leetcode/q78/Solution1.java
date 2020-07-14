package me.liuhu.study.leetcode.q78;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/14
 **/
public class Solution1 implements Solution {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < len; i++) {
            dfs(result, new ArrayList<>(), nums, len, i);
        }
        return result;
    }


    private void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, int len, int level) {
        if (len == level) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            // 剪枝
            if (path.size() > 0 && path.get(path.size() - 1) >= nums[i]) {
                continue;
            }

            path.add(nums[i]);
            dfs(result, path, nums, len, level + 1);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        int[] nums = new int[]{1, 2, 3, 4};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}
