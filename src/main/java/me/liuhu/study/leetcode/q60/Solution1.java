package me.liuhu.study.leetcode.q60;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/9/5
 **/
public class Solution1 implements Solution {

    int dep = 0;
    @Override
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;
        boolean[] used = new boolean[n];
        return dfs(nums, used,"", k);
    }

    private String dfs(int[] nums, boolean[] used, String path, int k) {
        if (path.length() == nums.length) {
            dep++;
            if (dep == k) {
                return path;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            String result = dfs(nums, used,path + nums[i], k);
            used[i] = false;
            if (null != result) {
                return result;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Solution solution = new Solution1();
        System.out.println(solution.getPermutation(9, 161191));
    }
}
