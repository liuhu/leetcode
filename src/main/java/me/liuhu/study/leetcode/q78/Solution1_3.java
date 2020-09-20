package me.liuhu.study.leetcode.q78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/20
 **/
public class Solution1_3 implements Solution {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            dfs(result, nums, new ArrayList<>(), i);
        }
        return result;
    }

    private void dfs(List<List<Integer>> result, int[] nums, List<Integer> path, int len) {
        if (path.size() == len) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (!path.isEmpty() && path.get(path.size() - 1) >= num) {
                continue;
            }
            path.add(num);
            dfs(result, nums, path, len);
            path.remove(path.size() - 1);
        }
    }
}
