package me.liuhu.study.leetcode.q46;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/13
 **/
public class Solution1_2 implements Solution {

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if (len == 0) {
            return res;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();

        dfs(path, nums, used, res, len, 0);
        return res;
    }


    private void dfs(List<Integer> path, int[] nums, boolean[] used, List<List<Integer>> res, int len, int level) {
        if (len == level) {
            res.add(new ArrayList<>(path));
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);

            dfs(path, nums, used, res, len, level + 1);

            // 回溯
            used[i] = false;
            path.remove((Integer) nums[i]);
        }
    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution1_2();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}
