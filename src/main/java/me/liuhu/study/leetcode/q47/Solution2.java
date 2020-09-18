package me.liuhu.study.leetcode.q47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/18
 **/
public class Solution2 implements Solution {
    @Override
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums) {
            return result;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        dfs(result, nums, used, new ArrayList<>());
        return result;
    }

    public void dfs(List<List<Integer>> result, int[] nums, boolean[] used, List<Integer> path) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            // 去除重复解，
            // 因为 nums 中包含重复数字，
            // nums[i] == nums[i - 1] 表示上个分支的数字和当前分支的数字相同，所以要排除该分支
            // !used[i - 1] 表示上个分支已经被回溯为false
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            dfs(result, nums, used, path);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = new int[]{1,1,2};
        solution2.permuteUnique(nums);
    }
}
